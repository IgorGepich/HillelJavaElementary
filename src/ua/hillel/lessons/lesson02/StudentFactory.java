package ua.hillel.lessons.lesson02;

public class StudentFactory {
	Student student = new Student();

	public Student studentCreate() {
		Student student = new Student();
		student.setName(createName());
		student.setStudentId(createId());
		return student;
	}
	public String[] studentsNamesArray = {"Vasya", "Petya", "Kolya", "Masha", "Henrik", "Nastya",
												"Yura", "Sveta", "Vova", "Dima", "Igor"};

	private int createId(){
		return student.studentId + (0 + (int) Math.round((Math.random() * 10)));
	}
	private String createName() {
		int i = (int) (Math.random() * studentsNamesArray.length);
		student.name = studentsNamesArray[i];
		return student.name;
	}
}
