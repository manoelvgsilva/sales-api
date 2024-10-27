package com.app.sales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * salesapiapplication.
 */
@SpringBootApplication
@EnableFeignClients
public class SalesApiApplication {

  public static void main(String[] args) {
    SpringApplication.run(SalesApiApplication.class, args);
  }

}
