package com.micronaut.response;

public class ResponseError implements RestAPIResponse {
    private String message;
    private Long statusCode;
    private String error;

    public ResponseError(){

    }

    public ResponseError(String message, Long statusCode, String error){
        this.message = message;
        this.statusCode = statusCode;
        this.error = error;
    }



}
