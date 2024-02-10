package org.example.employeemanager.api;

import org.apache.coyote.BadRequestException;
import org.example.employeemanager.dto.error.ErrorResponse;
import org.example.employeemanager.exception.InternalServerErrorException;
import org.example.employeemanager.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerController {

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorResponse> handleUserNotFoundException(UserNotFoundException e) {
        return buildErrorResponse(e, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(BadRequestException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<ErrorResponse> handleBadRequestException(BadRequestException e) {
        return buildErrorResponse(e, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(InternalServerErrorException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<ErrorResponse> handleInternalServerErrorException(InternalServerErrorException e) {
        return buildErrorResponse(e, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    private ResponseEntity<ErrorResponse> buildErrorResponse(Exception e, HttpStatus status) {
        ErrorResponse errorResponse = new ErrorResponse(status.value(), e.getMessage());
        return new ResponseEntity<>(errorResponse, status);
    }
}
