package ua.hillel.lessons.lesson02;

import java.util.Arrays;

public class SortAndFind {

	private Student[] studentsArray = new Student[10];
	private StudentFactory studentFactory = new StudentFactory();

	Student[] fillArray() {
		for (int i = 0; i < studentsArray.length; i++) {
			studentsArray[i] = studentFactory.studentCreate();
			System.out.println(studentsArray[i].getFullStudentName());
		}
		return studentsArray;
	}

	Student[] sortStudentsByID(){
			for (int i = 0; i < studentsArray.length; i++){
			for (int j = 0; j < studentsArray.length; j++){
				if (studentsArray[i].studentId < studentsArray[j].studentId){
					Student tmp = studentsArray[j];
					studentsArray[j] = studentsArray[i];
					studentsArray[i] = tmp;
				}
			}
		}
			return studentsArray;
	}
	/**
	Realization of Find and FindStudentByName methods can find Student by name, or by partial name match.
	 */
	void find(){
	Student students = findStudentByName(studentsArray, "Igor");
		for(int i = 0; i < studentsArray.length; i++) {
			if (students == null) {
				System.out.println("Student not found");
				break;
			} else {
				System.out.println("Found student name: " + students.name);
				break;
			}
		}
	}

	private Student findStudentByName(Student[] studentsArray, String nameToFind) {
		Student foundStudents = null;
		for (Student student : studentsArray) {
			if (student.name.contains(nameToFind)) {
				foundStudents = student;
				break;
			}
		}
		return foundStudents;
	}

	void sortByName(){
		Arrays.sort(studentsArray);
		System.out.println("Sort array by Name field" + Arrays.asList(studentsArray));
	}

	public void print(){
		for (Student student : studentsArray) {
			System.out.println(student.name + " " + student.studentId);
		}
	}
}


