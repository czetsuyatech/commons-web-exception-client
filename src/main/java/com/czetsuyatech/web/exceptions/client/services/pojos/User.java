package com.czetsuyatech.web.exceptions.client.services.pojos;

import java.time.Instant;
import lombok.Data;

@Data
public class User {

  private String organization;
  private String firstName;
  private String lastName;
  private Instant birthdate;
  private String email;
  private String phone;
}
