package com.litongjava.tio.web.hello.controller;

import com.jfinal.core.Controller;
import com.jfinal.core.Path;

@Path("/")
public class IndexController extends Controller {

  public void index() {
    renderText("Hello Web");
  }
}
