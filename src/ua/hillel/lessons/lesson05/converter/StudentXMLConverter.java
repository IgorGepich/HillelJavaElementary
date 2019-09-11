package ua.hillel.lessons.lesson05.converter;

import ua.hillel.lessons.lesson05.Student;

public class StudentXMLConverter implements IStudentStringConverter {

	@Override
	public String converter(Student student) {
		StringBuilder xmlBuilder = new StringBuilder();
		xmlBuilder.append("<student>")
						.append("\n\t")
						.append("<firstName>")
						.append(student.getFirstName())
						.append("</firstName>")
						.append("\n\t")
						.append("<lastName>")
						.append(student.getLastName())
						.append("</lastName>")
						.append("\n\t")
						.append("<course>")
						.append(student.getCourse())
						.append("</course>")
						.append("\n\t")
						.append("<age>")
						.append(student.getAge())
						.append("</age>\n")
				  .append("</student>");
		return xmlBuilder.toString();
	}
}
