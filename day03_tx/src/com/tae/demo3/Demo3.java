package com.tae.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Taeyeon-Serenity on 2017/8/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext3.xml")
public class Demo3 {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void run1(){
        accountService.pay("张三","王五",2000);

    }
}
