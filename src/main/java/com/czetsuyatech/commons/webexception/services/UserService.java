package com.czetsuyatech.commons.webexception.services;

import com.czetsuyatech.commons.webexception.services.pojos.User;

public interface UserService {

  void createUserAndThrowException(User user);

  void createUserAndThrowCustomException(User user);
}
