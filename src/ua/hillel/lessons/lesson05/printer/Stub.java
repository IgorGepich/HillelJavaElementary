package ua.hillel.lessons.lesson05.printer;

import ua.hillel.lessons.lesson05.Student;

public class Stub implements IStudentPrinter {
	@Override
	public void printer(Student student) {
		//TODO Do nothing
		System.out.println("This is stub, do nothing");
	}
}
