package db;

import java.sql.*;

public class DbConnection {

	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			final String url = "jdbc:mysql://sql677.main-hosting.eu/u393904398_infobooth";
			final String username = "u393904398_infobooth";
			final String password = "Admin@123";
			Connection conn = DriverManager.getConnection(url, username, password);
			return conn;
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}