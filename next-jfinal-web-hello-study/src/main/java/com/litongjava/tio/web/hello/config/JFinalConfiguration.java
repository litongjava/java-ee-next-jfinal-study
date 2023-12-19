package com.litongjava.tio.web.hello.config;

import com.jfinal.aop.annotation.Bean;
import com.jfinal.aop.annotation.Configuration;
import com.jfinal.config.JFinalConfig;

@Configuration
public class JFinalConfiguration {

  @Bean
  public JFinalConfig jfinalConfig() {
    return new DemoConfig();
  }
}
