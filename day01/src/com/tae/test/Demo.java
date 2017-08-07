package com.tae.test;

import com.tae.demo.UserService;
import com.tae.demo.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Taeyeon-Serenity on 2017/8/2.
 */
public class Demo {
    /**
     * 原本的方式
     * */
    @Test
    public void run1(){
        //创建实现类
        UserService us=new UserServiceImpl();
        us.sayHello();
    }

    /**
     * Spring的方式
     * */
    @Test
    public void run2(){
        //创建工厂，加载核心配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");

        //从工厂中获取到对象
        UserServiceImpl usi = (UserServiceImpl) ac.getBean("UserService");

        //调用对象的方法执行
        usi.sayHello();
    }

    /**
     * 接口的方式
     * */
    @Test
    public void run3(){
        //创建工厂，加载核心配置文件
        ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");

        //从工厂中获取到对象
        UserService usi = (UserService) ac.getBean("UserService");

        //调用对象的方法执行
        usi.sayHello();
    }
}
