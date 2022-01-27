package com.micronaut.service;

import com.micronaut.entity.Product;
import com.micronaut.response.ResponseError;
import com.micronaut.response.RestAPIResponse;
import io.micronaut.http.HttpResponse;
import jakarta.inject.Singleton;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Singleton
public class ProductService {

    final static List<Product> products = new ArrayList<>();

    @PostConstruct
    public void init(){
        var product1 = new Product("Caio", new BigDecimal("200"));
        var product2 = new Product("Mariana", new BigDecimal("9000"));
        var product3 = new Product("Cainho", new BigDecimal("2000"));
        product1.setId(UUID.fromString("123F123-1231D-123DD-123DF"));

        products.add(product1);
        products.add(product2);
        products.add(product3);
    }



    public List<Product> getAll(){
        return products;
    }


    public HttpResponse<RestAPIResponse> getOne(UUID uuid){
        for(Product product : products){
            if(product.getId() == uuid) return HttpResponse.badRequest().body(product);
        }
        return HttpResponse.badRequest().body(new ResponseError("Error ao buscar product", 400L, "Product not found"));
    }

}
