package com.tae.demo2;

import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Taeyeon-Serenity on 2017/8/3.
 */
public class MyCglibUtils {

    /**
     * 使用Cglib方式生成代理的对象
     *
     * @param dao*/
    public static BookDaoImpl getProxy(BookDaoImpl dao){
        Enhancer enhancer=new Enhancer();
        //设置父类
        enhancer.setSuperclass(BookDaoImpl.class);

        //设置回调函数
        enhancer.setCallback(new MethodInterceptor() {
            //代理对象的方法执行，回调函数就会执行
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//                System.out.println("Cglib-回调函数");
                if("save".equals(method.getName())){
                    System.out.println("保存图书--记录日志");
                }
                return methodProxy.invokeSuper(o,objects);
            }
        });
        //生成代理对象
        BookDaoImpl proxy = (BookDaoImpl) enhancer.create();

        return proxy;
    }
}
