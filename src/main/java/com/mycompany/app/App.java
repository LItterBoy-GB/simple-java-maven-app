package com.mycompany.app;

import java.sql.*;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!\n";

    public App() {}

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println(new App().getMessage());
        // 1.加载数据访问驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.连接到数据"库"上去
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ibk?connectTimeout=6000&socketTimeout=60000", "ibk", "i123b456k");
        //3.构建SQL命令
        Statement state=conn.createStatement();
        ResultSet res =state.executeQuery("select * from user;");
        System.out.println(res.getFetchSize());
        conn.close();
    }

    private final String getMessage() {
        return message;
    }

}
