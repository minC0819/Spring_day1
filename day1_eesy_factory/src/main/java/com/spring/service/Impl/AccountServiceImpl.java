package com.spring.service.Impl;

import com.spring.service.IAccountService;
import com.spring.service.dao.IAccountDao;
import com.spring.service.dao.impl.AccountDaoImpl;
import com.spring.service.factory.BeanFactory;

import javax.swing.*;

/*
* 账户业务逻辑层实现类
* */
public class AccountServiceImpl implements IAccountService {

//    private IAccountDao accountDao = new AccountDaoImpl();
    private IAccountDao accountDao = (IAccountDao)BeanFactory.getBean("accountDao");

    /*private int i = 1;*/

    public void saveAccount(){
            int i = 1;
            accountDao.saveAccount();
            System.out.println(i);
            i++;
    }
}
