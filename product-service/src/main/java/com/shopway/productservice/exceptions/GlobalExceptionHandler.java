package com.shopway.productservice.exceptions;

import com.shopway.productservice.utils.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
   @ExceptionHandler(NotFoundException.class)
   public ResponseEntity<ApiResponse<String>> handleNotFoundException (NotFoundException ex) {
       return ApiResponse.notFound(ex.getMessage(), null);
   }
}
