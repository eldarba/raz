package b.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo6Read {

	public static void main(String[] args) {

		String dbUrl = "jdbc:derby://localhost:1527/db2";
		try (Connection con = DriverManager.getConnection(dbUrl);) { // 1. connect (ARM)
			System.out.println("connected to " + dbUrl);

			String sql = "select * from person";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql); // returns a ResultSet object
			System.out.println(sql);

			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println(id + ", " + name + ", " + age);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		// 5. automatically disconnect from db
		System.out.println("disconnected from " + dbUrl);
	}

}
