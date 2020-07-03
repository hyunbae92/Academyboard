package vo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	private static String url = "jdbc:mariadb://localhost:3306/java";
	private static String user = "hyunbae";
	private static String password = "153789";
	private static String driverName = "org.mariadb.jdbc.Driver";
	private static Connection conn;
	static {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		if (conn == null) {
			conn = DriverManager.getConnection(url, user, password);
		}
		return conn;
	}

	public static void close() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		conn = null;
	}
}
