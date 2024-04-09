package com.czetsuyatech.commons.webexception.web.models;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import java.io.Serializable;
import java.time.Instant;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.StringUtils;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@Validated
public class UserV1 implements Serializable {

  @NotNull
  private String organization;

  @NotNull
  private String firstName;

  @NotNull
  private String lastName;

  @Past
  private Instant birthdate;

  private String email;
  private String phone;

  /**
   * Should have only one value for filled for email or phone.
   *
   * @return true if only email or phone is filled
   */
  public @AssertTrue(message = "Only one parameter should be populated: {email | phone}.") boolean isEmailOrPhoneOnly() {

    int ctr = 0;
    if (StringUtils.hasLength(email)) {
      ctr++;
    }

    if (StringUtils.hasLength(phone)) {
      ctr++;
    }

    return ctr == 1;
  }
}
