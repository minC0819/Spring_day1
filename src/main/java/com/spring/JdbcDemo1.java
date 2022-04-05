package com.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JdbcDemo1 {
    public static void main(String[] args) throws Exception{
        //1、注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //2、连接数据库
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy", "root", "123456");
        //3、获取操作数据库的预处理对象
        PreparedStatement pstm = conn.prepareStatement("select * form account");
        //4、执行SQL语句
        ResultSet rs = pstm.executeQuery();
        //5、遍历结果集
        while(rs.next()){
            System.out.println(rs.getString("name"));
        }
        //6、释放资源
        rs.close();
        pstm.close();
        conn.close();
    }
}
