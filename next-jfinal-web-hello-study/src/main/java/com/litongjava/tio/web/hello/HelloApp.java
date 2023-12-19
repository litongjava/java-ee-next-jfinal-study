package com.litongjava.tio.web.hello;

import com.jfinal.aop.annotation.ComponentScan;
import com.litongjava.tio.boot.JFinalApplication;

@ComponentScan
public class HelloApp {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    JFinalApplication.run(HelloApp.class, args);
    long end = System.currentTimeMillis();
    System.out.println((end - start) + "ms");
  }
}
