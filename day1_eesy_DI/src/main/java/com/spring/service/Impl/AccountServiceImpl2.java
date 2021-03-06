package com.spring.service.Impl;

import com.spring.service.IAccountService;

import java.util.Date;

/*
* 账户业务逻辑层实现类
* */
public class AccountServiceImpl2 implements IAccountService {

    // 如果是经常变化的数据，并不适合注入
    private String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void saveAccount(){
        System.out.println("service中的saveAccount方法执行了！！！" + name +"," + age +","+ birthday);
    }

}
