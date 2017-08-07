package com.tae.demo2;

import com.tae.demo1.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Taeyeon-Serenity on 2017/8/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo2 {

    @Resource(name = "userService")
    private UserService userService;

    @Test
    public void run1(){
        //原来：获取工厂，加载配置文件，getBean
        userService.sayHello();
    }
}
