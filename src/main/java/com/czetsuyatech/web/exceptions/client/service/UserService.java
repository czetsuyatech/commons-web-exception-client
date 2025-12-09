package com.czetsuyatech.web.exceptions.client.service;

import com.czetsuyatech.web.exceptions.client.application.pojo.User;

public interface UserService {

  void createUserAndThrowException(User user);

  void createUserAndThrowCustomException(User user);
}
