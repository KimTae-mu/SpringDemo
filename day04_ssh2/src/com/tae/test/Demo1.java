package com.tae.test;

/**
 * Created by Taeyeon-Serenity on 2017/8/6.
 */

import com.tae.domain.Customer;
import com.tae.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 测试Hibernate模板类的简单方法
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class Demo1 {

    @Resource(name = "customerService")
    private CustomerService customerService;


    /**
     * 测试
     * */
    @Test
    public void run1(){
        Customer customer = new Customer();
        customer.setCust_id(1L);
        customer.setCust_name("测试");
        customerService.update(customer);
    }

    /**
     * 查询某个客户
     * */
    @Test
    public void run2(){
        Customer customer = customerService.getById(2L);
        System.out.println(customer);
    }

    /**
     * 查询所有客户
     * */
    @Test
    public void run3(){
        List<Customer> list = customerService.findAll();
        System.out.println(list);
    }

    /**
     * 使用QBC查询所有客户
     * */
    @Test
    public void run4(){
        List<Customer> list = customerService.findAllByQBC();
        System.out.println(list);
    }
}
