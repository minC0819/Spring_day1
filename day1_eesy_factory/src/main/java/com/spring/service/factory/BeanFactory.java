package com.spring.service.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
* 一个Bean对象的工厂
*
* Bean在计算机英语中，有可重用组件的含义
*
* 第一步：需要一个配置文件来配置我们的service（业务逻辑层）和Dao（数据访问层）
*       配置文件的内容：唯一标识=全限定名称
* 第二步：通过读取配置文件中配置的内容，反射创建对象
* */
public class BeanFactory {
    // 定义一个Properties对象
    private static Properties props;

    // 定义一个Map，用于存放我们要创建的对象，我们把它称之为容器
    private static Map<String, Object> beans;

    // 使用静态代码块为Properties对象赋值
    static{
        try {
            // 实例化对象
            props = new Properties();
            // 获取Properties文件的流对象
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            // 实例化容器
            beans = new HashMap<String, Object>();
            // 取出配置文件中所有的key
            Enumeration keys = props.keys();
            // 遍历枚举
            while(keys.hasMoreElements()){
                // 取出每个key
                String key = keys.nextElement().toString();
                // 根据key获取value
                String beanPath = props.getProperty(key);
                // 反射创建对象
                Object value = Class.forName(beanPath).newInstance();
                // 放入容器
                beans.put(key, value);
            }
        }catch(Exception e){
            throw new ExceptionInInitializerError("初始化Properties失败！");
        }
    }

    public static Object getBean(String beanName){
        return beans.get(beanName);
    }

/*    /**
     * 根据bean的名称获取对象
     * @param beanName
     * @return
     *//*
    public static Object getBean(String beanName){
        Object bean = null;
        try {
            String beanPath = props.getProperty(beanName);
//            System.out.println(beanPath);
            bean = Class.forName(beanPath).newInstance();
        }catch(Exception e){
            e.printStackTrace();
        }
        return bean;
    }*/
}
