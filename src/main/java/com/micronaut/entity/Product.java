package com.micronaut.entity;

import com.micronaut.response.RestAPIResponse;

import java.math.BigDecimal;
import java.util.UUID;

public class Product implements RestAPIResponse {
    private String name;
    private UUID id = UUID.randomUUID();
    private BigDecimal valor;


    public Product(){

    }

    public Product(String name, BigDecimal valor){
        this.name = name;
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
