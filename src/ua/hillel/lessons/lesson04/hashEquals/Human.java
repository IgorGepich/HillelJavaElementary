package ua.hillel.lessons.lesson04.hashEquals;

import java.util.Objects;

public class Human {

	private String firstName;
	private String lastName;
	private int age;

	private String getFirstName() {
		return firstName;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private String getLastName() {
		return lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Human)) return false;
		Human human = (Human) o;
		return getAge() == human.getAge() &&
				getFirstName().equals(human.getFirstName()) &&
				getLastName().equals(human.getLastName());
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, age);
	}

	@Override
	public String toString(){
		return "Name: " + firstName + " \nLast name: " + lastName + " \nAge: " + age;
	}

	Human manCreate(){
		Human man = new Human();
		man.setFirstName("Igor");
		man.setLastName("Sutulov");
		man.setAge(39);
		return man;
	}

	Human secondManCreate(){
		Human secondMan = new Human();
		secondMan.setFirstName("Igor");
		secondMan.setLastName("Sutulov");
		secondMan.setAge(39);
		return secondMan;
	}

	Human womanCreate() {
		Human woman = new Human();
		woman.setFirstName("Anastasia");
		woman.setLastName("Sutulova");
		woman.setAge(26);
		return woman;
	}

	void print(){
		System.out.println("To String:");
		System.out.println(manCreate().toString() + "\n" + womanCreate().toString());
		System.out.println("Hash code");
		System.out.println("First obj hash: " + manCreate().hashCode() + "\nSecond obj hash: " + womanCreate().hashCode()
							+ "\nThird obj hash: " + secondManCreate().hashCode());
		System.out.println("Compare First obj with Second obj: " + manCreate().equals(womanCreate())+ " " + manCreate().hashCode() + " --> "
				+ womanCreate().hashCode());
		System.out.println("Compare First obj with Third obj: " + manCreate().equals(secondManCreate()) + " " + manCreate().hashCode() + " --> "
				+ secondManCreate().hashCode());
	}
}
