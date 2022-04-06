package com.spring.service.factory;

import com.spring.service.IAccountService;
import com.spring.service.Impl.AccountServiceImpl;

/**
 * 模拟一个工厂类，该类可能存在于jar包中的，我们无法通过修改源码的方式来提供默认构造函数
 */
public class instanceFactory {
    public static IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
