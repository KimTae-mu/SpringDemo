package com.tae.service;

import com.tae.dao.CustomerDao;
import com.tae.domain.Customer;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

	public void update(Customer customer) {
		System.out.println("业务层：修改客户...");
		customerDao.update(customer);
	}

	public Customer getById(Long id) {
		return customerDao.getById(id);
	}

	public List<Customer> findAll() {
		return customerDao.findAll();
	}

	public List<Customer> findAllByQBC() {
		return customerDao.findAllByQBC();
	}

	public Customer loadById(long id) {
		return customerDao.loadById(id);
	}

}
