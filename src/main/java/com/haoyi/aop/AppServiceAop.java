package com.haoyi.aop;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import com.alibaba.fastjson.serializer.SerializerFeature;

@Aspect
@Configuration
public class AppServiceAop {

  public Logger logger = LoggerFactory.getLogger(AppServiceAop.class);
  
  public static SerializerFeature[] FEATURES = {SerializerFeature.WriteClassName};
  
//  @Autowired
//  private CommonAESService commonAESService;

//  @Pointcut("execution(* com.haoyi.business.registered.service.HospitalInfoService.select*(..))||"
//      + "execution(* com.haoyi.business.registered.service.DeptInfoService.select*(..))||"
//      + "execution(* com.haoyi.business.registered.dao.DoctorInfoDao.select*(..))")
//  public void baseDataPoint() {}
//
//  @SuppressWarnings("unchecked")
//  @Around("baseDataPoint()")
//  public Object aroundPointBaseData(ProceedingJoinPoint thisJoinPoint) {
//    logger.debug("进入aroundPoint切面方法.....");
//    try {
//      String  enCacheName ="";
//      MemcachedHelper memcachedHelper = MemcachedHelper.getInstance();
//      if (memcachedHelper.keyExists(enCacheName)) {
//        logger.debug(enCacheName+",直接取出缓存数据....");
//        return JSONObject.parseObject((String)memcachedHelper.get(enCacheName),((MethodSignature) thisJoinPoint.getSignature()).getReturnType());
//      }
//      Object obj = (Object) thisJoinPoint.proceed();
//      logger.debug("记录缓存,Name:"+enCacheName);
//      memcachedHelper.set(enCacheName, JSONObject.toJSONString(obj,FEATURES), new Date(18 * 60 * 60 * 1000));
//      return obj;
//    } catch (Throwable e) {
//      logger.error("进入切面抛出异常....");
//      e.printStackTrace();
//    }
//    return null;
//  }

}
