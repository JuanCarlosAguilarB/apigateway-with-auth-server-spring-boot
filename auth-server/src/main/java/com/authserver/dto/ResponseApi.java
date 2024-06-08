package com.authserver.dto;


import lombok.Builder;

@Builder
public class ResponseApi {

    private String message;
    private Integer statusCode;
    private Object data;

}
