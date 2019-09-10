package ua.hillel.lessons.lesson02;

public class Student implements Comparable<Student>{

	public String name;
	public int studentId;

	public Student() {

	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getFullStudentName(){
		return name + " " +studentId;
	}
	@Override
	public String toString(){
		return name + " " + studentId;
	}
	@Override
	public int compareTo(Student o) {
		return toString().compareTo(o.toString());
	}
}



