package com.mycompany.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println(new App().getMessage());
        // 1.加载数据访问驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2.连接到数据"库"上去
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ibk", "ibk", "i123b456k");
            //3.构建SQL命令
            Statement state=conn.createStatement();
            state.executeQuery("select * from user;");
            conn.close();
    }

    private final String getMessage() {
        return message;
    }

}
