package com.haoyi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.haoyi.connection.DynamicDataSourceRegister;

@SpringBootApplication
@ServletComponentScan
@EnableScheduling
@Import({DynamicDataSourceRegister.class})
public class Application{
 static Logger logger =LoggerFactory.getLogger(Application.class);
  
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    
  }
} 
