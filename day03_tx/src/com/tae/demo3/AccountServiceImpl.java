package com.tae.demo3;

import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Taeyeon-Serenity on 2017/8/4.
 */
/**
 * Transactional类上添加了注解，类中的所有的方法全部都有事务
 * */
@Transactional
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    /**
     * 转账的方法
     * */
    public void pay(String out, String in, double money) {

        //先扣钱
        accountDao.outMoney(out,money);
        int a=10/0;
        //加钱
        accountDao.inMoney(in, money);
    }
}
