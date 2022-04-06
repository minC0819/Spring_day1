package com.spring.service.ui;

import com.spring.service.IAccountService;
import com.spring.service.dao.IAccountDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
* 模拟一个表现层，用于调用业务层
* */
public class Client {
    /**
     * 根据Spring的IOC容器，并根据id获取对象
     *
     * ApplicationContext的三个常用实现类：
     *      ClassPathXmlApplicationContext 它可以加载类路径下的配置文件，前提是配置文件必须在类路径下。不在的话，加载不了
     *      FileSystemXmlApplicationContext 它可以加载磁盘任意路径下的配置文件（前提是要有访问权限）
     *      AnnotationConfigApplicationContext 它是用于读取注解创建容器的
     *
     * 核心容器的主要区别：
     *      ApplicationContext： 单例对象适用
     *          它在构建核心容器时，创建对象采用的策略是采用立即加载的方式。也就是说，只要一读取配置文件就创建配置文件中配置的对象
     *      BeanFactory： 多例对象适用
     *          它在构建核心容器时，创建对象采用的策略是采用延迟加载的方式，也就是说，什么时候根据id获取了对象，什么时候才真正创建对象。
     * @param args
     */
    public static void main(String[] args) {
        // 获取IOC容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        // 根据id获取bean对象
        // 直接强转
        IAccountService as = (IAccountService)ac.getBean("accountService");
        // 用字节码进行转换
        IAccountDao ad = ac.getBean("accountDao", IAccountDao.class);

        System.out.println(as);
        System.out.println(ad);
//        as.saveAccount();
    }
}

