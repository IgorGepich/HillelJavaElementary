package ua.hillel.lessons.lesson05;

import ua.hillel.lessons.lesson05.converter.*;
import ua.hillel.lessons.lesson05.printer.DelegatingPrinters;
import ua.hillel.lessons.lesson05.printer.IStudentPrinter;
import ua.hillel.lessons.lesson05.printer.PrinterToCLI;

import java.util.ArrayList;
import java.util.List;

public class MainLesson05 {
	public static void main(String[] args) {
		Student student = new Student("Igor", "Sutulov", "Java Elementary", 39);

		// OLD REALISATION
//		StudentStringConverter stringConverter = new StudentStringConverter();
//		System.out.println("Convert obj Student to string example:");
//		System.out.println(stringConverter.converter(student) + "\n");
//
//		StudentXMLConverter xmlConverter = new StudentXMLConverter();
//		System.out.println("Convert obj Student to XML format:");
//		System.out.println(xmlConverter.converter(student) + "\n");
//
//		StudentJSONConverter jsonConverter = new StudentJSONConverter();
//		System.out.println("Convert obj Student to JSON format:");
//		System.out.println(jsonConverter.converter(student) + "\n");
//
//		StudentINIConverter iniConverter = new StudentINIConverter();
//		System.out.println("Convert obj Student to INI format:");
//		System.out.println(iniConverter.converter(student) + "\n");

//		PrinterToCLI printerToCLI = new PrinterToCLI();
//		System.out.println("Print converting to string obj Student to CLI:");
//		printerToCLI.printer(student);

		IStudentStringConverter studentStringConverter = new StudentStringConverter();
		IStudentStringConverter studentJsonConverter = new StudentJSONConverter();
		IStudentStringConverter studentIniConverter = new StudentINIConverter();
		IStudentStringConverter studentXmlConverter = new StudentXMLConverter();

		IStudentPrinter stringPrinter = new PrinterToCLI(studentStringConverter);
		IStudentPrinter jsonPrinter = new PrinterToCLI(studentJsonConverter);
		IStudentPrinter iniPrinter = new PrinterToCLI(studentIniConverter);
		IStudentPrinter xmlPrinter = new PrinterToCLI(studentXmlConverter);

		List<IStudentPrinter> iStudentPrinterList = new ArrayList<>();
		iStudentPrinterList.add(stringPrinter);
		iStudentPrinterList.add(jsonPrinter);
		iStudentPrinterList.add(iniPrinter);
		iStudentPrinterList.add(xmlPrinter);

		IStudentPrinter iStudentPrinter = new DelegatingPrinters(iStudentPrinterList);
		iStudentPrinter.printer(student);
	}
}
