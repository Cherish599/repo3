package com.itheima.jdbcdemo;

import static org.hamcrest.CoreMatchers.nullValue;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.junit.Test;

import com.itheima.entity.User;

//使用JDBC技术实现查询数据库数据，并显示在控制台中
public class Demo2 {
	@Test
	public void testSelect() throws Exception {
		// 加载驱动
		Class.forName("com.mysql.jdbc.Driver");

		// 获取连接Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06", "root", "hxy878690590");

		// 得到执行sql语句的对象Statemment
		java.sql.Statement stmt = conn.createStatement();

		// 执行sql语句，并返回结果
		ResultSet rs = stmt.executeQuery("select * from users");
		List<User> list = new ArrayList<User>();
		// 处理结果
		while (rs.next()) {
			User u = new User();
			u.setId(rs.getInt("id"));
			u.setName(rs.getString("name"));
			u.setPassword(rs.getString("password"));
			u.setEmail(rs.getString("email"));
			u.setBirthday(rs.getDate("birthday"));
			list.add(u);
		}
		// 关闭资源
		rs.close();
		stmt.close();
		conn.close();
		for (User user : list) {
			System.out.println(user);
		}
	}

	@Test
	public void testSelect1() throws Exception {
		// 加载驱动
		Class.forName("com.mysql.jdbc.Driver");

		// 获取连接Connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06", "root", "hxy878690590");

		// 得到执行sql语句的对象Statemment
		java.sql.Statement stmt = conn.createStatement();

		// 执行sql语句，并返回结果
		ResultSet rs = stmt.executeQuery("select * from users");
		List<User> list = new ArrayList<User>();

		rs.afterLast();
		rs.previous();
		// 处理结果
		// while (rs.next()) {
		User u = new User();
		u.setId(rs.getInt("id"));
		u.setName(rs.getString("name"));
		u.setPassword(rs.getString("password"));
		u.setEmail(rs.getString("email"));
		u.setBirthday(rs.getDate("birthday"));
		list.add(u);
		// }
		// 关闭资源
		rs.close();
		stmt.close();
		conn.close();
		// for (User user : list) {
		System.out.println(u);
		// }
	}

	@Test
	public void test1() throws Exception {
		// 加载驱动
		Class.forName("com.mysql.jdbc.Driver");
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

	@Test
	public void test2() throws Exception {
		// 加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 获取连接Connection
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/day06",
		// "root", "hxy878690590");
		Properties info = new Properties();
		info.setProperty("user", "root");
		info.setProperty("password", "hxy878690590");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06", info);

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

	@Test
	public void test3() throws Exception {
		// 加载驱动
		Class.forName("com.mysql.jdbc.Driver");
		// 获取连接Connection
		// Connection conn =
		// DriverManager.getConnection("jdbc:mysql://localhost:3306/day06",
		// "root", "hxy878690590");
		// Properties info = new Properties();
		// info.setProperty("user", "root");
		// info.setProperty("password", "hxy878690590");
		Connection conn = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/day06?user=root&password=hxy878690590");

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

	public void test4() throws Exception {
		// 获取连接Connection
		Connection conn = null;
		// 得到执行sql语句的对象Statemment
		java.sql.Statement stmt = null;
		// 执行sql语句，并返回结果
		ResultSet rs = null;
		try {
			// 加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day06?user=root&password=hxy878690590");

			stmt = conn.createStatement();

			rs = stmt.executeQuery("select * form users");

			// 处理结果
			while (rs.next()) {
				System.out.println(rs.getObject(1)); // 第一列
				System.out.println(rs.getObject(2));
				System.out.println(rs.getObject(3));
				System.out.println(rs.getObject(4));
				System.out.println(rs.getObject(5));
				System.out.println("-----------------");

			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} finally {
			// 关闭资源
			if(rs!= null){
				try {
					rs.close();
				} catch (Exception e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				rs=null;
			}
			if(stmt!=null){
				try {
					stmt.close();
				} catch (Exception e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				stmt=null;
			}
			if(conn!=null){
				try {
					conn.close();
				} catch (Exception e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			conn=null;
		}

	}
}
