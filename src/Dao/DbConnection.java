package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {
	// String PILOTE = "com.mysql.jdbc.Driver";
	static String user = "root";
	static String password = "";
	static String url = "jdbc:mysql://localhost:3306/banque";

	private static Connection connection;

	static {	
		try {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {
		return connection;
	}

}
