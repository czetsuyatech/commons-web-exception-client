package com.czetsuyatech.commons.webexception.web.exceptions;

import com.czetsuyatech.commons.web.exceptions.AbstractWebExceptionCodes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class WebExceptions extends AbstractWebExceptionCodes {

  @Value("${spring.application.name}")
  private String serviceName;

  public WebExceptions() {

    super(HttpStatus.OK);

    registerExceptionMap(AppExceptionCodes.getMapValues());
  }

  @Override
  public String getServiceName() {
    return serviceName;
  }
}
