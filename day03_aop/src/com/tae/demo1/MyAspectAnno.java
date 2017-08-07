package com.tae.demo1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by Taeyeon-Serenity on 2017/8/4.
 */
@Aspect
public class MyAspectAnno {

    /*
    * 通知类型：@Before前置通知(切入点的表达式)
    * */
    @Before(value = "MyAspectAnno.fn()")
    public void log(){
        System.out.println("记录日志。。。");
    }

    /**
     * 最终通知：方法执行成功或者出现异常，都会执行
     * */
    @After(value = "MyAspectAnno.fn()")
    public void after(){
        System.out.println("最终通知--记录日志。。。");
    }

    /**
     * 环绕通知：
     * */
    @Around(value = "MyAspectAnno.fn()")
    public void around(ProceedingJoinPoint joinPoint){
        System.out.println("环绕通知1。。。");
        try {
            //让目标对象的方法执行
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("环绕通知2。。。");
    }

    /**
     * 自定义切入点
     * */
    @Pointcut(value = "execution(public * com.tae.demo1.CustomerDaoImpl.save())")
    public void fn(){

    }
}
