package com.tae.demo3;

/**
 * Created by Taeyeon-Serenity on 2017/8/3.
 */
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save() {
        System.out.println("保存客户...");
    }

    @Override
    public void update() {
        System.out.println("修改客户...");
    }
}
