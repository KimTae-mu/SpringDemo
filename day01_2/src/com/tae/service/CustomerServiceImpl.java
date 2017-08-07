package com.tae.service;

import com.tae.dao.CustomerDao;

/**
 * Created by Taeyeon-Serenity on 2017/8/3.
 */
public class CustomerServiceImpl implements CustomerService {

    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void save() {
        System.out.println("业务层：保存客户~~");
        customerDao.save();
    }
}
