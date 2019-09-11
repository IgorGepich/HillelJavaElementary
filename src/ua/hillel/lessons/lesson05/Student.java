package ua.hillel.lessons.lesson05;

public class Student {
	private String firstName;
	private String lastName;
	private String course;
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCourse() {
		return course;
	}

	public int getAge() {
		return age;
	}

	public Student(String firstName, String lastName, String course, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.course = course;
		this.age = age;
	}
	public Student(){

	}

}
