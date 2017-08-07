package com.tae.demo1;

/**
 * Created by Taeyeon-Serenity on 2017/8/4.
 */

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * 演示JDBC的模板类
 * */
public class Demo1 {

    /**
     * 演示模板类
     * */
    @Test
    public void run1(){
        //Spring框架提供了内置的连接池，不想使用内置，整合其他的连接池
        DriverManagerDataSource dataSource=new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql:///spring_day03");
        dataSource.setUsername("root");
        dataSource.setPassword("taeyeon");
        //创建模板类
        JdbcTemplate template=new JdbcTemplate();
        template.setDataSource(dataSource);

        //完成操作
        template.update("insert into t_account values (null,?,?)","张三",10000);

    }
}
