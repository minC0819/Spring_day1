package com.spring.service.Impl;

import com.spring.service.IAccountService;

import java.util.Date;

/*
* 账户业务逻辑层实现类
* */
public class AccountServiceImpl implements IAccountService {

    // 如果是经常变化的数据，并不适合注入
    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public void saveAccount(){
        System.out.println("service中的saveAccount方法执行了！！！" + name +"," + age +","+ birthday);
    }

}
