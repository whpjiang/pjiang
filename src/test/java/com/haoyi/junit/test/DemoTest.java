package com.haoyi.junit.test;

import java.util.List;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.haoyi.Application;
import com.haoyi.demo.dao.DemoDao;
import com.haoyi.demo.pojo.Demo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class DemoTest {

  public Logger logger = LoggerFactory.getLogger(DemoTest.class);

  @Autowired
  private DemoDao demoDao;
  /**
   * 科室查询
   */
  @org.junit.Test
  public void DemoSelectAllTest() {
    List<Demo> demos = demoDao.selectALLDemo();
    logger.debug("Demos数据"+demos.toString());
  }

}

