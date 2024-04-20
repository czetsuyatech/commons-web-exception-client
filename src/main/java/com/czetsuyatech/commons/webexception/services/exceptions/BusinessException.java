package com.czetsuyatech.commons.webexception.services.exceptions;

import com.czetsuyatech.commons.webexception.web.exceptions.AppExceptionCodes;
import com.czetsuyatech.commons.webexception.web.exceptions.WebException;
import org.springframework.http.HttpStatus;

public class BusinessException extends WebException {

  public BusinessException() {
    super(HttpStatus.BAD_REQUEST, AppExceptionCodes.BUSINESS_EXCEPTION_X, "Custom exception message");
  }
}
