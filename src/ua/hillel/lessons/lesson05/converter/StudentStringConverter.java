package ua.hillel.lessons.lesson05.converter;

import ua.hillel.lessons.lesson05.Student;

public class StudentStringConverter implements IStudentStringConverter {

	@Override
	public String converter(Student student){
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("\"name:\" ")
						.append(student.getFirstName())
						.append(", \"lastName:\" ")
						.append(student.getLastName())
						.append(", \"course:\" ")
						.append(student.getCourse())
						.append(", age: ")
						.append(student.getAge());
		return stringBuilder.toString();
	}
}
