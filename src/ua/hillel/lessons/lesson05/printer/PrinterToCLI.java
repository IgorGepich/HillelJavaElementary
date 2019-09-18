package ua.hillel.lessons.lesson05.printer;

import ua.hillel.lessons.lesson05.Student;
import ua.hillel.lessons.lesson05.converter.IStudentStringConverter;

public class PrinterToCLI implements IStudentPrinter {
	public IStudentStringConverter iStudentStringConverter;

	public PrinterToCLI(IStudentStringConverter iStudentStringConverter){
		this.iStudentStringConverter = iStudentStringConverter;
	}
	@Override
	public void printer(Student student) {
		System.out.println(iStudentStringConverter.converter(student));
	}
}
