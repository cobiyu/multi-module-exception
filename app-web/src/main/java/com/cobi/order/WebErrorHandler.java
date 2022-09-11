package com.cobi.order;

import com.cobi.order.exception.Status4xxException;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class WebErrorHandler {

  @ExceptionHandler(Status4xxException.class)
  public ResponseEntity<?> badRequestHandler(Status4xxException e) {
    int statusCode = e.getStatusCode();

    // invalid 400
    if(statusCode < 400 || statusCode >= 500) {
      statusCode = 400;
    }

    return ResponseEntity.status(statusCode).body(
        Map.of(
            "message", e.getMessage()
        )
    );
  }
}
