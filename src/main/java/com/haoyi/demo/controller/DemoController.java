package com.haoyi.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.haoyi.demo.pojo.Demo;
import com.haoyi.demo.service.CacheService;
import com.haoyi.demo.service.DemoService;

@RestController
@RequestMapping(value = "demo")
public class DemoController {

  Logger logger =LoggerFactory.getLogger(DemoController.class);
  
  @Autowired
  private DemoService demoService;
  
  @Autowired
  private CacheService cacheService;
  
  /**
   * 注册界面
   * @return
   */
  @RequestMapping(value = "register")
  public ModelAndView register(){
    logger.debug("进入register处理方法.....");
   return new ModelAndView("register"); 
  }
  
  /**
   * 提交表单
   * @param demo
   * @return
   */
  @RequestMapping(value = "submit")
  public ModelAndView submit(@ModelAttribute Demo demo){
    logger.debug("进入submit处理方法.....");
    demoService.addDemo(demo);
    List<Demo> demos =demoService.selectDemoAll();
   return new ModelAndView("result","demos",demos); 
  }
  
  /**
   * 查询所有demo数据
   * @return
   */
  @RequestMapping(value = "query")
  public ModelAndView query(){
    logger.debug("进入submit处理方法.....");
    List<Demo> demos =demoService.selectDemoAll();
   return new ModelAndView("result","demos",demos); 
  }
  
  /**
   * 使用postmen调用，随机产生一个值会缓存5秒，然后再生成下一个值
   * @return
   */
  @RequestMapping(value = "cacheTest")
  public String cacheTest(){
    return cacheService.getRandomNum();
  }
  
}
