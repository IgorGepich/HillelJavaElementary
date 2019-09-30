package ua.hillel.lessons.lesson07.studentCompare.students;

import java.util.ArrayList;

public class StudentGroup {
	public ArrayList studentGroup = new ArrayList<String>();
	public ArrayList fillGroup(){
		StudentFactory studentFactory = new StudentFactory();
		for(int i = 0; i < 10; i++){
			studentGroup.add(studentFactory.studentCreate());
		}
		return studentGroup;
	}

	public void printStudentGroup(){
		for (Object o : studentGroup) System.out.println(o);
	}
}
