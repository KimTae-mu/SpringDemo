package com.tae.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.tae.domain.Customer;
import com.tae.service.CustomerService;

/**
 * 客户的控制层
 * @author Administrator
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	
	private static final long serialVersionUID = 113695314694166436L;
	
	// 不要忘记手动new
	private Customer customer = new Customer();
	public Customer getModel() {
		return customer;
	}
	
	// 提供service的成员属性，提供set方法
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	/**
	 * 保存客户的方法
	 * @return
	 */
	public String add(){
		System.out.println("WEB层：保存客户...");
		/*// WEB的工厂
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
		CustomerService cs = (CustomerService) context.getBean("customerService");
		// 调用方法
		cs.save(customer);*/
		
		customerService.save(customer);
		
		return NONE;
	}

	/**
	 * 演示延时加载的问题
	 * */
	public String loadById(){
		Customer customer=customerService.loadById(3L);
		//打印客户的名称
		System.out.println(customer.getCust_name());

		return NONE;
	}
	
}












