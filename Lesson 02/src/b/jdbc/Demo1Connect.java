package b.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo1Connect {

	public static void main(String[] args) {
		String dbUrl = "jdbc:derby://localhost:1527/db2;create=true";
		try {
			Connection con = DriverManager.getConnection(dbUrl);
			System.out.println("connected to " + dbUrl);
			con.close();
			System.out.println("disconnected from " + dbUrl);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
