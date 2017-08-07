package com.tae.demo2;

/**
 * Created by Taeyeon-Serenity on 2017/8/4.
 */
public interface AccountDao {
    public void outMoney(String out, double money);

    public void inMoney(String in, double money);
}
