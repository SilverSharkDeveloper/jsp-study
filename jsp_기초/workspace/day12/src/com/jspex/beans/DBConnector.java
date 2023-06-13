package com.jspex.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	public static Connection getConnection() {
		Connection connection = null;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String id = "hr";
		String password = "1234";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url, id, password);
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("DB접속 실패");
		}catch(Exception e) {
			System.out.println("알수 없는 오류");
		}
		return connection;
	}
}
