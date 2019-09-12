package ua.hillel.lessons.lesson05;

import ua.hillel.lessons.lesson05.converter.StudentINIConverter;
import ua.hillel.lessons.lesson05.converter.StudentJSONConverter;
import ua.hillel.lessons.lesson05.converter.StudentStringConverter;
import ua.hillel.lessons.lesson05.converter.StudentXMLConverter;
import ua.hillel.lessons.lesson05.printer.PrinterToCLI;
import ua.hillel.lessons.lesson05.printer.Stub;

public class MainLesson05 {
	public static void main(String[] args) {
		Student student = new Student("Igor", "Sutulov", "Java Elementary", 39);

		StudentStringConverter stringConverter = new StudentStringConverter();
		System.out.println("Convert obj Student to string example:");
		System.out.println(stringConverter.converter(student) + "\n");

		StudentXMLConverter xmlConverter = new StudentXMLConverter();
		System.out.println("Convert obj Student to XML format:");
		System.out.println(xmlConverter.converter(student) + "\n");

		StudentJSONConverter jsonConverter = new StudentJSONConverter();
		System.out.println("Convert obj Student to JSON format:");
		System.out.println(jsonConverter.converter(student) + "\n");

		StudentINIConverter iniConverter = new StudentINIConverter();
		System.out.println("Convert obj Student to INI format:");
		System.out.println(iniConverter.converter(student) + "\n");

		PrinterToCLI printerToCLI = new PrinterToCLI();
		System.out.println("Print converting to string obj Student to CLI:");
		printerToCLI.printer(student);
	}
}
