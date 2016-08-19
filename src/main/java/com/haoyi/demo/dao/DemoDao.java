package com.haoyi.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haoyi.connection.TargetDataSource;
import com.haoyi.demo.mapper.DemoMapper;
import com.haoyi.demo.pojo.Demo;
import com.haoyi.demo.pojo.DemoExample;

@Service
public class DemoDao {
  
  @Autowired
  private DemoMapper demoMapper;
  
  
  @TargetDataSource(name = "ds1")
  public void addDemo(Demo demo){
    demoMapper.insertSelective(demo);
  }
  
  @TargetDataSource(name = "ds1")
  public List<Demo> selectALLDemo(){
    DemoExample example = new DemoExample();
    return  demoMapper.selectByExample(example);
  }

}
