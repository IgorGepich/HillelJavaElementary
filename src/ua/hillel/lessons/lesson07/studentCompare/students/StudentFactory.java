package ua.hillel.lessons.lesson07.studentCompare.students;

public class StudentFactory {
	Student student = new Student();
	/**
	 * @return student - object with randomised name and randomised age
	 */

	public Student studentCreate() {
		Student student = new Student();
		student.setStudentName(createName());
		student.setStudentAge(createRandomStudentAge());
		return student;
	}
	// array contains names of students
	public String[] studentsNamesArray = {"Vasya", "Petya", "Kolya", "Masha", "Henrik", "Nastya",
			"Yura", "Sveta", "Vova", "Dima", "Igor"};

	private int createRandomStudentAge(){
		return student.studentAge + ((int) (Math.random() * 20) + 18);
	}
	private String createName() {
		int i = (int) (Math.random() * studentsNamesArray.length);
		student.studentName = studentsNamesArray[i];
		return student.studentName;
	}
}
