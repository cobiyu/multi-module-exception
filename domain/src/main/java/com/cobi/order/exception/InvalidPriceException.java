package com.cobi.order.exception;

public class InvalidPriceException extends Status4xxException{

  public InvalidPriceException(String message) {
    super(message);
  }

  public InvalidPriceException(String message, Integer statusCode) {
    super(message, statusCode);
  }

}
