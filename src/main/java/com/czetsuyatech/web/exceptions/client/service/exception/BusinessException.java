package com.czetsuyatech.web.exceptions.client.service.exception;

import com.czetsuyatech.web.exceptions.client.web.exception.AppExceptionCodes;
import com.czetsuyatech.web.exceptions.client.web.exception.WebException;
import org.springframework.http.HttpStatus;

public class BusinessException extends WebException {

  public BusinessException() {
    super(HttpStatus.BAD_REQUEST, AppExceptionCodes.BUSINESS_EXCEPTION_X, "Custom exception message");
  }
}
