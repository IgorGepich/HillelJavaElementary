package ua.hillel.lessons.lesson02;

public class StudentClassroom {
	public static void addStudentToClassroom(){
		StudentFactory vasiliy = new StudentFactory();
		vasiliy.studentCreate().name = "Ivan";
		vasiliy.studentCreate().studentId = 21;
		System.out.println(Student.getName() + " " + Student.getStudentId());

		StudentFactory igor = new StudentFactory();
		igor.studentCreate().name = "Igor";
		igor.studentCreate().studentId = 31;
		System.out.println(Student.getName() + " " + Student.getStudentId());

		Object[] stud = new Object[2];
		stud[0] = vasiliy;
		stud[1] = igor;

		StringBuilder sb =new StringBuilder();
		sb.append(igor.studentCreate().name + " and ").append(igor.studentCreate().studentId);
		System.out.println(sb.toString());

		for(int i = 0; i < stud.length; i++){
//			System.out.println(Arrays.toString(stud));
			System.out.println(stud[1].toString());
		}
	}
}
