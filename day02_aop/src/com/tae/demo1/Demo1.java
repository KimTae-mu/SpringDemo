package com.tae.demo1;

import org.junit.Test;

/**
 * Created by Taeyeon-Serenity on 2017/8/3.
 */
public class Demo1 {

    @Test
    public void run1(){
        //目标对象
        UserDao dao=new UserDaoImpl();
        dao.save();
        dao.update();

        System.out.println("====================================");

        //使用工具类，获取到代理对象
        UserDao proxy = MyProxyUtils.getProxy(dao);
        //调用代理对象的方法
        proxy.save();
        proxy.update();
    }
}
