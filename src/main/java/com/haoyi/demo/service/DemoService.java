package com.haoyi.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haoyi.demo.dao.DemoDao;
import com.haoyi.demo.pojo.Demo;
import com.haoyi.utils.MD5;

@Service
public class DemoService {

  
  @Autowired
  private DemoDao demoDao;
  
  /**
   * 新增一个用户
   * @param userId
   * @param passWord
   * @param email
   */
  public void addDemo(Demo demo){
    if(null!=demo.getPassword()){
      demo.setPassword(MD5.getMD5(demo.getPassword()));
    }
    demoDao.addDemo(demo);
  }
  
  /**
   * 查询所有用户
   * @return
   */
  public List<Demo> selectDemoAll(){
    return demoDao.selectALLDemo();
  } 
  
}
