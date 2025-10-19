package com.czetsuyatech.web.exceptions.client.web.exceptions;

import com.czetsuyatech.web.exceptions.AbstractWebExceptions;
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
