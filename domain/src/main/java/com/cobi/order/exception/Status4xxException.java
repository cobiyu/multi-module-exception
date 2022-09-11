package com.cobi.order.exception;

import lombok.Getter;

@Getter
public abstract class Status4xxException extends RuntimeException{
  private final Integer statusCode;

  public Status4xxException(String message) {
    super(message);
    statusCode = 400;
  }

  public Status4xxException(String message, Throwable e) {
    super(message, e);
    this.statusCode = 400;
  }

  public Status4xxException(String message, Integer statusCode) {
    super(message);
    this.statusCode = statusCode;
  }

  public Status4xxException(String message, Integer statusCode, Throwable e) {
    super(message, e);
    this.statusCode = statusCode;
  }
}
