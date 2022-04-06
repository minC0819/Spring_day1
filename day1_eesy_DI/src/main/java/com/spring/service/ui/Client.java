package com.spring.service.ui;

import com.spring.service.IAccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
* 模拟一个表现层，用于调用业务层
* */
public class Client {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // 获取IOC容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 根据id获取bean对象
        // 直接强转
//        IAccountService as = (IAccountService)ac.getBean("accountService");
//        as.saveAccount();

//        IAccountService as = (IAccountService)ac.getBean("accountService2");
//        as.saveAccount();

        IAccountService as = (IAccountService)ac.getBean("accountService3");
        as.saveAccount();
    }
}

