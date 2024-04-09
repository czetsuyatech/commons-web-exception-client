package com.czetsuyatech.commons.webexception.web.exceptions;

import com.czetsuyatech.commons.web.exceptions.AbstractWebExceptionHandler;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@RequiredArgsConstructor
public class WebExceptionHandler extends AbstractWebExceptionHandler {

  private final WebExceptions webExceptions;

  @Override
  public String getServiceName() {
    return webExceptions.getServiceName();
  }
}
