package com.czetsuyatech.web.exceptions.client.services;

import com.czetsuyatech.web.exceptions.client.services.pojos.User;

public interface UserService {

  void createUserAndThrowException(User user);

  void createUserAndThrowCustomException(User user);
}
