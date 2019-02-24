package com.github.edgar615.spring.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ConfigClientApplication {
    public static void main(String[] args) {
      ApplicationContext context = SpringApplication.run(ConfigClientApplication.class, args);
      Environment environment = context.getEnvironment();
      System.out.println(environment.getProperty("msg"));
    }
}
