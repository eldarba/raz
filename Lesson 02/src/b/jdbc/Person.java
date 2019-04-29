package b.jdbc;

public class Person implements Creature {

	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		super.equals(obj);
		if (this == obj) { // same memory address?
			return true;
		}
		if (obj == null) { // is null?
			return false;
		}

		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Person p1 = new Person(111, "aaa", 25);
		Person p2 = new Person(111, "bbb", 28);
		String str = "AAA";
		Person p3 = p1;

		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(str));
		System.out.println(p1.equals(p3));
	}

	@Override
	public void act() {
		System.out.println("Act as a person");

	}

}
