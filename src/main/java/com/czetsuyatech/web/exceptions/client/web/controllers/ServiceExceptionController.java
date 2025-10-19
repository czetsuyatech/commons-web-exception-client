package com.czetsuyatech.web.exceptions.client.web.controllers;

import com.czetsuyatech.web.exceptions.client.mappers.Web2ServiceMapper;
import com.czetsuyatech.web.exceptions.client.services.UserService;
import com.czetsuyatech.web.exceptions.client.web.models.UserV1;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@Validated
@RequestMapping("/service-exceptions")
@RequiredArgsConstructor
public class ServiceExceptionController {

  private final UserService userService;
  private final Web2ServiceMapper web2ServiceMapper;

  @PostMapping("/users/exceptions")
  public void createUserAndThrowException(@RequestBody @Valid @NotNull UserV1 userV1) {

    log.debug("Request to create user={}", userV1);

    userService.createUserAndThrowException(web2ServiceMapper.asUser(userV1));
  }

  @PostMapping("/users/custom-exceptions")
  public void createUserAndThrowCustomException(@RequestBody @Valid @NotNull UserV1 userV1) {

    log.debug("Request to create user={} with custom exception", userV1);

    userService.createUserAndThrowCustomException(web2ServiceMapper.asUser(userV1));
  }
}
