package com.czetsuyatech.web.exceptions.client.services.impl;

import com.czetsuyatech.web.exceptions.client.services.UserService;
import com.czetsuyatech.web.exceptions.client.services.exceptions.BusinessException;
import com.czetsuyatech.web.exceptions.client.services.pojos.User;
import com.czetsuyatech.web.exceptions.client.web.exceptions.AppExceptionCodes;
import com.czetsuyatech.web.exceptions.client.web.exceptions.WebException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserServiceImpl implements UserService {

  @Override
  public void createUserAndThrowException(User user) {

    log.debug("Creating user={}", user);

    throw new WebException(HttpStatus.BAD_REQUEST, AppExceptionCodes.USER_CREATION_FAILED);
  }

  @Override
  public void createUserAndThrowCustomException(User user) {

    log.debug("Creating user={} and throwing custom exception", user);

    throw new BusinessException();
  }
}
