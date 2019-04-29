package b.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PersonDAO {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {

			System.out.print("enter id: ");
			int id = Integer.parseInt(sc.nextLine());

			System.out.print("enter name: ");
			String name = sc.nextLine();

			System.out.print("enter age: ");
			int age = Integer.parseInt(sc.nextLine());

			Person p = new Person(id, name, age);
			System.out.println(p);

			PersonDAO dao = new PersonDAO();
			dao.createPerson(p);

		}
	}

	private String dbUrl = "jdbc:derby://localhost:1527/db2";

	// DAO - Data Access Object

	/**
	 * insert the specified Person to the database
	 */
	public void createPerson(Person person) {
		try (Connection con = DriverManager.getConnection(dbUrl);) {
			String sql = "insert into person values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, person.getId());
			pstmt.setString(2, person.getName());
			pstmt.setInt(3, person.getAge());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
