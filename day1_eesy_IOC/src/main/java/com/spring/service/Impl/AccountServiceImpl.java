package com.spring.service.Impl;

import com.spring.service.IAccountService;
import com.spring.service.dao.IAccountDao;
import com.spring.service.dao.impl.AccountDaoImpl;

import javax.swing.*;

/*
* 账户业务逻辑层实现类
* */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();

    public void saveAccount(){
            accountDao.saveAccount();
    }
}
