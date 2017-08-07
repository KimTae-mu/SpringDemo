package com.tae.demo2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by Taeyeon-Serenity on 2017/8/4.
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {


    public void outMoney(String out, double money) {
        this.getJdbcTemplate().update("UPDATE t_account SET money=money-? where name= ? ",money,out);
    }

    public void inMoney(String in, double money) {
        this.getJdbcTemplate().update("UPDATE t_account SET money=money+? where name= ? ",money,in);

    }
}
