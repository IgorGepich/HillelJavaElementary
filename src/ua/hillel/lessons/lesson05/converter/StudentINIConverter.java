package ua.hillel.lessons.lesson05.converter;

import ua.hillel.lessons.lesson05.Student;

public class StudentINIConverter implements IStudentStringConverter {
	@Override
	public String converter(Student student) {
		StringBuilder iniBuilder = new StringBuilder();
		iniBuilder.append("firstName=")
					.append(student.getFirstName())
					.append("\n")
					.append("lastName=")
					.append(student.getLastName())
					.append("\n")
					.append("course=")
					.append(student.getCourse())
					.append("\n")
					.append("age=")
					.append(student.getAge());
		return iniBuilder.toString();
	}
}
