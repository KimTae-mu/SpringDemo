package com.tae.demo1;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by Taeyeon-Serenity on 2017/8/3.
 */
/**
 * UserDaoImpl交给IOC容器去管理
 * */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("保存客户~~");
    }
}
