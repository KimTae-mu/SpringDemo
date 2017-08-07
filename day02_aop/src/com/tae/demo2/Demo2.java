package com.tae.demo2;

import org.junit.Test;

/**
 * Created by Taeyeon-Serenity on 2017/8/3.
 */
public class Demo2 {
    @Test
    public void run1(){
        //目标对象
        BookDaoImpl dao=new BookDaoImpl();
        dao.save();
        dao.update();

        System.out.println("====================================");
        //使用Cglib方式生成代理对象
        BookDaoImpl proxy = MyCglibUtils.getProxy(dao);
        proxy.save();
        proxy.update();

    }
}
