package ua.hillel.lessons.lesson05.printer;

import ua.hillel.lessons.lesson05.Student;
import ua.hillel.lessons.lesson05.converter.IStudentStringConverter;

public class Stub implements IStudentStringConverter {

	@Override
	public String converter(Student student) {
		return null;
	}
}
