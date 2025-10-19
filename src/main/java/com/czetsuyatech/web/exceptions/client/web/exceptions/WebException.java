package com.czetsuyatech.web.exceptions.client.web.exceptions;

import com.czetsuyatech.web.exceptions.WebBaseException;
import org.springframework.http.HttpStatusCode;

public class WebException extends WebBaseException {

  public WebException(HttpStatusCode status, AppExceptionCodes appExceptionCode) {
    this(status, appExceptionCode.getCode(), null);
  }

  public WebException(HttpStatusCode status, String code) {
    this(status, code, null);
  }

  public WebException(HttpStatusCode status, AppExceptionCodes appExceptionCode, String message) {
    this(status, appExceptionCode.getCode(), message);
  }

  public WebException(HttpStatusCode status, String code, String message) {
    super(status, code, message);
  }
}
