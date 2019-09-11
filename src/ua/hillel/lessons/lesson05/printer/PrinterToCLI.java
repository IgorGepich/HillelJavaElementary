package ua.hillel.lessons.lesson05.printer;

import ua.hillel.lessons.lesson05.Student;
import ua.hillel.lessons.lesson05.converter.StudentStringConverter;

public class PrinterToCLI implements IStudentPrinter {

	StudentStringConverter stringConverter = new StudentStringConverter();

	@Override
	public String printer(Student student) {
		System.out.println(stringConverter.converter(student));
		return null;
	}

	public void stringConverter() {
	}
}
