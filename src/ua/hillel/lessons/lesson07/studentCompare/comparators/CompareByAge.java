package ua.hillel.lessons.lesson07.studentCompare.comparators;

import ua.hillel.lessons.lesson07.studentCompare.students.Student;

import java.util.Comparator;

public class CompareByAge  {

	public static Comparator<Student> AgeComparator = (student1, student2) -> student1.getStudentAge() - student2.getStudentAge();
}
