package com.tae.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by Taeyeon-Serenity on 2017/8/3.
 */
/**
 * 组件注解，标记类
 * <bean id="userService" class="com.tae.demo1.UserServiceImpl"/>   ==    @Component(value = "userService")
 * */
@Component(value = "userService")
public class UserServiceImpl implements UserService {
    //给name属性注入字符串，setName方法还可以省略不写
    @Value(value = "张三")
    private String name;

    /*public void setName(String name) {
        this.name = name;
    }*/
    //@Autowired  按照类型自动装配
/*    @Autowired
      @Qualifier(value = "userDao")  //按名称注入*/

    @Resource(name = "userDao")     //是Java的注解，Spring框架支持该注解 相当于@Autowired和@Qualifier一起使用
    private UserDao userDao;

    @Override
    public void sayHello() {
        System.out.println("hello Spring~~"+name);
        userDao.save();
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化...");
    }
}
