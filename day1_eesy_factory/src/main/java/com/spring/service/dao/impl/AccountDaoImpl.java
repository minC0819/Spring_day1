package com.spring.service.dao.impl;

import com.spring.service.dao.IAccountDao;

public class AccountDaoImpl implements IAccountDao {
    public void saveAccount(){
        System.out.println("保存了账户!");
    }
}
