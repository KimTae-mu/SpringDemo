package com.tae.service;

import org.springframework.transaction.annotation.Transactional;

import com.tae.dao.CustomerDao;
import com.tae.domain.Customer;

/**
 * 客户的业务层
 * @author Administrator
 */
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	/**
	 * 保存客户
	 */
	public void save(Customer customer) {
		System.out.println("业务层：保存客户...");
		customerDao.save(customer);
	}

}
