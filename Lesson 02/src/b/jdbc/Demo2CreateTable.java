package b.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo2CreateTable {

	public static void main(String[] args) {

		String dbUrl = "jdbc:derby://localhost:1527/db2";
		try (Connection con = DriverManager.getConnection(dbUrl);) { // 1. connect (ARM)
			System.out.println("connected to " + dbUrl);

			// create a table
			// 2. define an sql command as java String
			String sql = "create table person(id integer, name varchar(15), age integer)";
			// 3. from the connection get a statement object to execute sql commands
			Statement stmt = con.createStatement();
			// 4. run the sql command using the statement
			stmt.executeUpdate(sql);
			System.out.println(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 5. automatically disconnect from db
		System.out.println("disconnected from " + dbUrl);
	}

}
