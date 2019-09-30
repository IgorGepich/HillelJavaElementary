package ua.hillel.lessons.lesson07.studentCompare.comparators;

import ua.hillel.lessons.lesson07.studentCompare.students.Student;

import java.util.Comparator;

public class CompareByAge implements Comparator<Student> {
	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getStudentAge(), student2.getStudentAge());
	}
	public Comparator<Student> AgeComparator = (student1, student2) -> student1.getStudentAge() - student2.getStudentAge();
}
