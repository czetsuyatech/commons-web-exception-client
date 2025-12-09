package com.czetsuyatech.web.exceptions.client.web.exception;

import java.util.LinkedHashMap;
import java.util.Map;
import lombok.Getter;

/**
 * Error codes for this component with the ff prefixes:
 * <pre>
 *   'A' - application error
 *   'B' - business error
 *   'S' - system error
 *   'E' - entity error
 * </pre>
 */
@Getter
public enum AppExceptionCodes {

  USER_CREATION_FAILED("A1001", "Use creation failed"),
  USER_EID_NOT_FOUND("A1002", "User not found"),
  USER_EMAIL_NOT_FOUND("A1003", "User not found"),
  USER_PHONE_NOT_FOUND("A1004", "User not found"),
  ORGANIZATION_NOT_FOUND("A1005", "Organization not found"),
  BUSINESS_EXCEPTION_X("B1001", "Business exception"),
  //
  ;

  private String code;
  private String message;

  AppExceptionCodes(String code, String message) {
    this.code = code;
    this.message = message;
  }

  public static Map<String, String> getMapValues() {

    Map<String, String> map = new LinkedHashMap<>();
    for (AppExceptionCodes errCode : values()) {
      map.put(errCode.getCode(), errCode.getMessage());
    }

    return map;
  }
}
