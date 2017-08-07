package com.tae.demo2;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * Created by Taeyeon-Serenity on 2017/8/4.
 */
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
