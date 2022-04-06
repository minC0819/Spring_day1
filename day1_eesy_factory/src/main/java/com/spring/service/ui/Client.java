package com.spring.service.ui;

import com.spring.service.IAccountService;
import com.spring.service.Impl.AccountServiceImpl;
import com.spring.service.factory.BeanFactory;

/*
* 模拟一个表现层，用于调用业务层
* */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            IAccountService as = (IAccountService)BeanFactory.getBean("accountService");
            System.out.println(as);
            as.saveAccount();
        }
    }
}

