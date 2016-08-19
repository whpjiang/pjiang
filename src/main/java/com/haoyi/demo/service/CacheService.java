package com.haoyi.demo.service;

import java.util.Date;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.haoyi.memcached.MemcachedHelper;

@Service
public class CacheService {

  /**
   * 获取一个随机数，随机数服务器会保存5秒然后释放
   */
  public String getRandomNum() {
    String key = "demo_getRandom";
    MemcachedHelper memcachedHelper = MemcachedHelper.getInstance();
    if (memcachedHelper.keyExists(key)) {
      return String.valueOf(memcachedHelper.get(key));
    }
    Random r = new Random();
    String num = String.valueOf(r.nextInt(10));
    //数据缓存5秒
    memcachedHelper.add(key, num, new Date(5 * 1000));
    return num;
  }
}
