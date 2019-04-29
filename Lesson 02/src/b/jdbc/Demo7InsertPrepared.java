package b.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo7InsertPrepared {

	public static void main(String[] args) {

		String dbUrl = "jdbc:derby://localhost:1527/db2";
		try (Connection con = DriverManager.getConnection(dbUrl);) {
			System.out.println("connected to " + dbUrl);

			Person p1 = new Person(152, "Efraim", 35);

			// String sql1 = "insert into person values(" + p1.getId() + ", '" +
			// p1.getName() + "', " + p1.getAge() + ")";
			// Statement stmt = con.createStatement();

			String sql2 = "insert into person values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql2);

			pstmt.setInt(1, p1.getId());
			pstmt.setString(2, p1.getName());
			pstmt.setInt(3, p1.getAge());

			// stmt.executeUpdate(sql);
			pstmt.executeUpdate();
			System.out.println(sql2);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("disconnected from " + dbUrl);
	}

}
