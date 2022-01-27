package com.micronaut.controller;

import com.micronaut.entity.Product;
import com.micronaut.response.RestAPIResponse;
import com.micronaut.service.ProductService;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;

import java.util.List;
import java.util.UUID;

@Controller("/product")
public class ProductController {

    @Inject
    ProductService productService;

    @Get
    public HttpResponse<List<Product>> getAll(){
        return productService.getAll();
    }


    @Post
    public HttpResponse<?> createProduct(@Body Product product){
        return productService.createProduct(product);
    }

    @Get("/{id}")
    public HttpResponse<RestAPIResponse> getOne(@PathVariable("id") String uuid){
        return productService.getOne(UUID.fromString(uuid));
    }

}
