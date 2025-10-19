package com.czetsuyatech.web.exceptions.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@EnableConfigurationProperties
@SpringBootApplication(
    exclude = DataSourceAutoConfiguration.class,
    excludeName = {
        "org.springframework.cloud.autoconfigure.RefreshAutoConfiguration"
    })
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }

}
