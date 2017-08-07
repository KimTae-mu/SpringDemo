package com.tae.demo1;

/**
 * Created by Taeyeon-Serenity on 2017/8/4.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 测试jdbc的模板类，使用IOC的方式
 * */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext.xml")
public class Demo1_1 {

    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Test
    public void run1(){
        jdbcTemplate.update("insert into t_account values (null,?,?)","赵六",10000);
    }

    /**
     * update:
     * */
    @Test
    public void run2(){
        jdbcTemplate.update("UPDATE t_account SET name = ? WHERE  id = ?","小苍",2);
    }

    /**
     * 测试查询：通过主键查询一条记录
     * */
    @Test
    public void run3(){
        Account account = jdbcTemplate.queryForObject("select * from t_account where id = ?", new BeanMapper(), 1);
        System.out.println(account);
    }

    /**
     * 查询所有的数据
     * */
    @Test
    public void run4(){
        List<Account> query = jdbcTemplate.query("select * from t_account", new BeanMapper());
        System.out.println(query);
    }
}


/**
 * 自己手动来封装数据
 * */
class BeanMapper implements RowMapper<Account>{

    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account ac=new Account();
        ac.setId(resultSet.getInt("id"));
        ac.setName(resultSet.getString("name"));
        ac.setMoney(resultSet.getDouble("money"));
        return ac;
    }
}