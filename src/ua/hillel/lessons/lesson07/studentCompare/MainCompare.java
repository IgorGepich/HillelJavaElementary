package ua.hillel.lessons.lesson07.studentCompare;

import ua.hillel.lessons.Constants.Constants;
import ua.hillel.lessons.lesson07.studentCompare.comparators.CompareByAge;
import ua.hillel.lessons.lesson07.studentCompare.comparators.CompareByName;
import ua.hillel.lessons.lesson07.studentCompare.students.StudentGroup;

import java.util.Collections;

public class MainCompare {
	public static void main(String[] args) {

		StudentGroup studentGroup = new StudentGroup();
		// fill Collection group of students by random name from studentsNamesArray
		// and random age
		studentGroup.fillGroup();
		// print result
		System.out.println("------------------Not sorting group of students-------------------");
		studentGroup.printStudentGroup();
		// sort Collection of students by the age
		Collections.sort(studentGroup.studentGroup, CompareByAge.AgeComparator);
		//print result
		System.out.println("-----------------Sort group of students by age--------------------");
		studentGroup.printStudentGroup();
		// sort Collection of students by the name
		Collections.sort(studentGroup.studentGroup, CompareByName.NameComparator);
		//print result
		System.out.println("----------------Sort group of students by name--------------------");
		studentGroup.printStudentGroup();
		//sort Collection by Age if Names is the same
		System.out.println(Constants.LINE_SEPARATOR);
		//refill Collection
		studentGroup.fillGroup();
		Collections.sort(studentGroup.studentGroup, CompareByName.SameName);
		studentGroup.printStudentGroup();

	}
}
