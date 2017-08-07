package com.tae.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.tae.service.CustomerService;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

/**
 * Created by Taeyeon-Serenity on 2017/8/2.
 */
/**
 * 客户的Action
 * */
public class CustomerAction extends ActionSupport {
    public String save(){
        System.out.println("WEB层：保存客户~~~");

        //使用工厂
        /*ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService cs = (CustomerService) ac.getBean("customerService");
        cs.save();*/

        //需要使用WEB的工厂的方式
        ServletContext servletContext = ServletActionContext.getServletContext();
        WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        CustomerService cs= (CustomerService) context.getBean("customerService");
        cs.save();

        return NONE;
    }
}
