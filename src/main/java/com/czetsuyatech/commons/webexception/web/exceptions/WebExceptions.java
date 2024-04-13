package com.czetsuyatech.commons.webexception.web.exceptions;

import com.czetsuyatech.commons.web.exceptions.AbstractWebExceptions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WebExceptions extends AbstractWebExceptions {

  @Value("${spring.application.name}")
  private String serviceName;

  public WebExceptions() {

    registerExceptionMap(AppExceptionCodes.getMapValues());
  }

  @Override
  public String getServiceName() {
    return serviceName;
  }
}
