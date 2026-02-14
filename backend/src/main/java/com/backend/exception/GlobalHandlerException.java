package com.backend.exception;

import com.backend.dto.ExceptionDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandlerException extends RuntimeException{

    @ExceptionHandler(NonExistentBookException.class)
    public ResponseEntity<ExceptionDto> handleNonExistentBookException(NonExistentBookException exception) {
        ExceptionDto exceptionDto = new ExceptionDto(HttpStatus.NOT_FOUND.value(), exception.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exceptionDto);
    }
}
