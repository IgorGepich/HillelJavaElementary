package ua.hillel.lessons.lesson07.studentCompare.comparators;

import ua.hillel.lessons.lesson07.studentCompare.students.Student;

import java.util.Comparator;

public class CompareByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return 0;
	}
	public Comparator<Student>NameComparator = Comparator.comparing(Student::getStudentName);

	public static Comparator<Student>SameName = new Comparator<Student>() {
		@Override
		public int compare(Student student1, Student student2) {
			int result = student1.getStudentName().compareTo(student2.getStudentName());
			if (result == 0) {
				Integer.compare(student1.getStudentAge(), student2.getStudentAge());
			}
			return result;
		}
	};
}
