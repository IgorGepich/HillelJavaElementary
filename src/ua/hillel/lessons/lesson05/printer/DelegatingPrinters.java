package ua.hillel.lessons.lesson05.printer;

import ua.hillel.lessons.lesson05.Student;

import java.util.List;

public class DelegatingPrinters implements IStudentPrinter{
	private final List<IStudentPrinter> iStudentPrinterList;

	public DelegatingPrinters(List<IStudentPrinter> iStudentPrinterList){
		this.iStudentPrinterList = iStudentPrinterList;
	}
	@Override
	public void printer(Student student) {
		for(IStudentPrinter print : iStudentPrinterList){
			print.printer(student);
		}
	}
}
