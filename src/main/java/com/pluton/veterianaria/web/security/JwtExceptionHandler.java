package com.pluton.veterianaria.web.security;

import com.pluton.veterianaria.persistencia.entity.ApiError;
import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class JwtExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {ExpiredJwtException.class})
    public ResponseEntity<Object> handleExpiredJwtException(ExpiredJwtException ex, WebRequest request) {
        // Aquí puedes agregar la lógica para manejar la excepción de expiración del token.
        // Por ejemplo, puedes enviar una respuesta de error personalizada al cliente.

        String message = "El token JWT ha expirado. Por favor inicie sesión nuevamente.";
        Exception exception = new Exception(message);
        ApiError error = new ApiError(HttpStatus.UNAUTHORIZED, message, exception);
        return handleExceptionInternal(ex, error, new HttpHeaders(), HttpStatus.UNAUTHORIZED, request);
    }

}
