package a;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		Person p = new Person();
		Scanner sc = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("enter age: ");
				int age = Integer.parseInt(sc.nextLine());
				p.setAge(age);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		sc.close();
		System.out.println(p.getAge());
	}

	public int divide(int a, int b) {

		if (b != 0) {
			// return is when all is good
			return a / b;
		} else {
			// return is when something is wrong
			throw new RuntimeException("error - divid by 0");
		}

	}

	public void stam() {
		return;
	}

}

class Person {
	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age <= 120) {
			this.age = age;
		} else {
			throw new RuntimeException("illegal age");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
