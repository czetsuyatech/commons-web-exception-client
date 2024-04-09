package com.czetsuyatech.commons.webexception.web.exceptions;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Error codes for this component with the ff prefixes:
 * <pre>
 *   'A' - application error
 *   'B' - business error
 *   'S' - system error
 *   'E' - entity error
 * </pre>
 */
public enum AppExceptionCodes {

  USER_CREATION_FAILED("A1001", "Use creation failed"),
  USER_EID_NOT_FOUND("A1002", "User not found"),
  USER_EMAIL_NOT_FOUND("A1003", "User not found"),
  USER_PHONE_NOT_FOUND("A1004", "User not found"),
  ORGANIZATION_NOT_FOUND("A1005", "Organization not found");

  private String code;
  private String message;

  AppExceptionCodes(String code, String message) {
    this.code = code;
    this.message = message;
  }

  public String getCode() {
    return code;
  }

  public String getDesc() {
    return message;
  }

  public static Map<String, String> getMapValues() {

    Map<String, String> map = new LinkedHashMap<>();
    for (AppExceptionCodes errCode : values()) {
      map.put(errCode.getCode(), errCode.getDesc());
    }

    return map;
  }
}
