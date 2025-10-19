package com.czetsuyatech.web.exceptions.client.services.exceptions;

import com.czetsuyatech.web.exceptions.client.web.exceptions.AppExceptionCodes;
import com.czetsuyatech.web.exceptions.client.web.exceptions.WebException;
import org.springframework.http.HttpStatus;

public class BusinessException extends WebException {

  public BusinessException() {
    super(HttpStatus.BAD_REQUEST, AppExceptionCodes.BUSINESS_EXCEPTION_X, "Custom exception message");
  }
}
