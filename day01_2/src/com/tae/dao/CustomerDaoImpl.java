package com.tae.dao;

/**
 * Created by Taeyeon-Serenity on 2017/8/3.
 */
public class CustomerDaoImpl implements CustomerDao {
    @Override
    public void save() {
        System.out.println("持久层：保存客户~~");
    }
}
