package com.authserver.exception;

import com.authserver.dto.ResponseApi;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
@Configuration

public class GlobalException{

    @ExceptionHandler({BadRequestExceptionApi.class})
    public ResponseEntity<ResponseApi> handleAccessDeniedException(BadRequestExceptionApi e,  WebRequest request) {

        ResponseApi response = ResponseApi.builder()
                .message(e.getMessage())
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .build();

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

}


