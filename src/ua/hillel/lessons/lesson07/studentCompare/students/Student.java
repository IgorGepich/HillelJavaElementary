package ua.hillel.lessons.lesson07.studentCompare.students;

public class Student{
	public int studentAge;
	public String studentName;

	public int getStudentAge() {
		return studentAge;
	}

	public int setStudentAge(int studentAge) {
		this.studentAge = studentAge;
		return studentAge;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

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
