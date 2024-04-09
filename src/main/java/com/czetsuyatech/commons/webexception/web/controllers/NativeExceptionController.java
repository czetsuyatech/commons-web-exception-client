package com.czetsuyatech.commons.webexception.web.controllers;

import com.czetsuyatech.commons.webexception.web.models.UserV1;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@Slf4j
@RestController
@Validated
@RequestMapping("/native-exceptions")
public class NativeExceptionController {

  /**
   * Will fail because both email and phone are populated.
   *
   * @param userV1
   */
  @PostMapping("/method-arguments")
  public void methodArgumentValidation(@RequestBody @Valid @NotNull UserV1 userV1) {

    log.info("Testing methodArgumentValidation {}", userV1);
  }

  @GetMapping("/forbidden")
  public void forbidden() {

    log.info("Testing forbidden {}");

    throw new ResponseStatusException(HttpStatus.FORBIDDEN);
  }
}
