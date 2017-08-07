package com.tae.demo3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Taeyeon-Serenity on 2017/8/3.
 */
/**
 * 测试AOP功能
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo3 {

    @Resource(name = "customerDao")
    private CustomerDao customerDao;

    @Test
    public void run3(){
        customerDao.save();
        customerDao.update();
    }
}
