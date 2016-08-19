package com.haoyi.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "hello")
public class HelloWorldController {

  Logger logger =LoggerFactory.getLogger(HelloWorldController.class);
  
  
  /**
   * 实现Hello World输出
   * @return
   */
  @RequestMapping(value = "helloWorld")
  public String helloWorld(){
    logger.debug("进入helloWorld处理方法.....");
   return "Hello World Java";
  }

  
  
  /**
   * 使用Html输出helloWorld
   * @return
   */
  @RequestMapping(value = "helloWorldHtml")
  public ModelAndView helloWorldHtml(){
    logger.debug("进入helloWorld处理方法.....");
   return new ModelAndView("helloWorld");
  }
  
  /**
   * 自定义后台内容输出到前台界面
   * @return
   */
  @RequestMapping(value = "helloWorldJava")
  public ModelAndView helloWorldJava(){
    logger.debug("进入helloWorld处理方法.....");
    SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
   return new ModelAndView("helloWorld","msg","现在时间是："+sdf.format(Calendar.getInstance().getTime()));
  }
}
