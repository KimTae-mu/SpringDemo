package com.tae.demo1;

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

    //注入事务的模板类
    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    /**
     * 转账的方法
     * */
    public void pay(String out, String in, double money) {

        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            //事务的执行，如果为没有问题，提交；如果出现异常，回滚
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                //先扣钱
                accountDao.outMoney(out,money);
                int a=10/0;
                //加钱
                accountDao.inMoney(in, money);
            }
        });


    }
}
