package ua.hillel.lessons.lesson07.studentCompare.students;

public class Student{
	/**
	 * studentAge age of the student
	 */
	int studentAge;
	String studentName;

	public int getStudentAge() {
		return studentAge;
	}

	void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentName() {
		return studentName;
	}

	void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * Creates instance of the class
	 * @param studentName set name of the student to the Object Student
	 * @param age set age of the student to the Object Student
	 */

	public Student(String studentName, int age){
		this.studentName = studentName;
		this.studentAge = age;
	}

	public Student(){}

	@Override
	public String toString(){
		return "Student name: " + getStudentName() + "\nStudent age: " + getStudentAge();
	}
}
