package ua.hillel.lessons.lesson02;

public class SortAndFind {

/**
Андрей добрый день.
 Не могу решить эту проблему пока что. Вчера в голове до 3 ночи дебажил код, пришел к выводу,
 что у меня в 20 строке всегда null и массив не заполняется после выполнения метода fillArray строка 22, то есть
 я не правильно возвращаю @return из метода.
 По этой причине все обращения к пустому массиву с попыткой его сортировки по полям, либо нахождения совпадений
 полей с заданными не приводят к успеху.
 Написал уже кучу методов и пока больше никаких вариантов не придумал. Ощущение что ускользает какая-то важная деталь,
 которую я не могу понять пока что и из-за этого проблемы.
 Ткните носом, если не сложно куда копать.
 Заранее благодарен
 PS Class StudentClassroom не используется в программе. Создавал для помытки реализации поиска в полях объектов
 массива через имплементацию интерфейса Comparable. Потом пошел по другому пути.
 */
	public static StudentFactory studentFactory = new StudentFactory();
	public static Student[] studentsArray = new Student[10];

	public static Student[] fillArray() {
		for (int i = 0; i < studentsArray.length; i++) {
			studentsArray[i] = studentFactory.studentCreate();
//			System.out.println(studentsArray[i].name + " " + studentsArray[i].studentId);
			}
		return studentsArray;
	}
	
	public static Student[] sortStudentsByID(){
			for (int i = 0; i < studentsArray.length; i++){
			for (int j = 0; j < studentsArray.length; j++){
				if (studentsArray[i].studentId > studentsArray[j].studentId){
					Student tmp = studentsArray[j];
					studentsArray[j] = studentsArray[i];
					studentsArray[i] = tmp;
				}
			}
		}
			return studentsArray;
	}
	public static void find(){
	Student students = findStudentByName(studentsArray, "Igor");
		for(int i = 0; i < studentsArray.length; i++) {
			if (students == null) {
				System.out.println("Student not found");
			} else {
				System.out.println("Found student name: " + students.name);
			}
		}
	}
	public static Student findStudentByName(Student[] studentsArray, String nameToFind) {
		Student foundStudents = null;
		for(int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i].name.contains(nameToFind)) {
				foundStudents = studentsArray[i];
				break;
			}
		}
		return foundStudents;
	}
	public static void sortStudentsByName(){
		for (int i = 0; i < studentsArray.length; i++){
			for (int j = 0; j < studentsArray.length; j++){
				if (studentsArray[i].name.compareTo(studentsArray[j].name) < 0){
					Student tmp = studentsArray[j];
					studentsArray[j] = studentsArray[i];
					studentsArray[i] = tmp;
					System.out.println(studentsArray[i].name + " " + studentsArray[i].studentId);
				}
			}
		}
	}
	public static Student[] findStudentsByName(Student[] studentsArray, String namesToFind) {
		Student[] searchResult = new Student[studentsArray.length];
		int freePosition = 0;
//        Student foundNames = null;
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i].name.contains(namesToFind)) {
				searchResult[freePosition] = studentsArray[i];
				freePosition++;
			}
		}return searchResult;
	}
//		Students[] foundNames = new Students[studentsArray.length];
////            int q = 0;
//		for (int i = 0; i < freePosition; i++){
//			foundNames[i] = searchResult[i];
//		}
//		searchResult = foundNames;
//		for(Students q : foundNames)
////                out.print(" " + q + " ");
////        out.println(Arrays.toString(searchResult));
////        out.println(foundNames);
//			out.println(searchResult);
//		return foundNames;
//	}
	public static void print(){
		for(int i = 0; i < studentsArray.length; i++){
			System.out.println(studentsArray[i].name + studentsArray[i].studentId);
		}
	}
}

