package ua.hillel.lessons.lesson05.converter;

import ua.hillel.lessons.lesson05.Student;

public class StudentJSONConverter implements IStudentStringConverter{

	@Override
	public String converter(Student student) {
		StringBuilder jsonBuilder = new StringBuilder();
		jsonBuilder	.append("\"firstName\": ")
						.append("\"")
						.append(student.getFirstName())
						.append("\",\n")
						.append("\"lastName\": ")
						.append("\"")
						.append(student.getLastName())
						.append("\",\n")
						.append("\"course\": ")
						.append("\"")
						.append(student.getCourse())
						.append("\",\n")
						.append("\"age\": ")
						.append(student.getAge());
		return jsonBuilder.toString();


	}
}
