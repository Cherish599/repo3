package com.itheima.jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

//使用JDBC技术实现查询数据库数据，并显示在控制台中
public class Demo1 {
	public static void main(String args[]) throws Exception {
		// 注册驱动
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());

		// 获取连接Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06", "root", "hxy878690590");

		// 得到执行sql语句的对象Statemment
		java.sql.Statement stmt = conn.createStatement();

		// 执行sql语句，并返回结果
		ResultSet rs = stmt.executeQuery("select * from users");

		// 处理结果
		while (rs.next()) {
			System.out.println(rs.getObject(1)); // 第一列
			System.out.println(rs.getObject(2));
			System.out.println(rs.getObject(3));
			System.out.println(rs.getObject(4));
			System.out.println(rs.getObject(5));
			System.out.println("-----------------");

		}
		// 关闭资源
		rs.close();
		stmt.close();
		conn.close();
	}
}
