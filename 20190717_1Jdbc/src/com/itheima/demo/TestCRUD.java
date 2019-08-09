package com.itheima.demo;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class TestCRUD {
	@Test
	public void testInsert() throws Exception {
		// 加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 获取连接Connection
		Connection conn = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/day06?user=root&password=hxy878690590");

		// 得到执行sql语句的对象Statemment
		java.sql.Statement stmt = conn.createStatement();

		// 执行sql语句，并返回结果
		int i = stmt.executeUpdate("INSERT INTO users VALUES (7,'tom','123','tom@163.com','2019-07-17')");
		if (i > 0) {
			System.out.println("success");
		}

		// 关闭资源
		stmt.close();
		conn.close();
	}
}
