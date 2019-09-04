package ua.hillel.lessons.lesson02;
/**
 * @autor Ihor Sutulov
 * @return Odject Student with String field Name and Int field Age
 * @version 1.0
 */
public class StudentFactory {
	Student student = new Student();

	public Student studentCreate() {
		student.studentId = createAge();
		student.name = createName();
//		System.out.println("Student name: " + student.name + ", Student ID: " + student.studentId);
		return new Student();
	}
	private String[] namesArray = {"Vasya", "Petya", "Kolya", "Masha", "Henrik", "Nastya", "Yura", "Sveta", "Vova", "Dima", "Igor"};

	private int createAge(){
		// Не работает диапазон рандома
		return student.studentId + (0 + (int) Math.round((Math.random() * 10)));
	}

	private String createName() {
		int n = (int) (Math.random() * namesArray.length);
		student.name = namesArray[n];
		return student.name;
	}

//		Student students = new Student();
//		int[] array = new int[11];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = (18 + (int) Math.round((Math.random() * 11)));
//			students.age = array[i];
//		}
//		String[] studentName = {"Vasya", "Petya", "Kolya", "Masha", "Henrik", "Nastya", "Yura", "Sveta", "Vova", "Dima", "Igor"};
//		int n = (int) (Math.random() * studentName.length);
//		students.name = studentName[n];
//		System.out.println("Student name: " + students.name + " " + "Student age: " + students.age + " years old.");
//		return students;

}
