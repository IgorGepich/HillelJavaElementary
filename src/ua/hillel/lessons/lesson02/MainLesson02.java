package ua.hillel.lessons.lesson02;

import ua.hillel.lessons.Constants;

public class MainLesson02 {
	public static void main(String[] args) {
		SortAndFind sortAndFind = new SortAndFind();
		sortAndFind.fillArray();
		System.out.println(Constants.LINE_SEPARATOR);
		sortAndFind.sortStudentsByID();
		sortAndFind.print();
		System.out.println(Constants.LINE_SEPARATOR);
		sortAndFind.find();
		System.out.println(Constants.LINE_SEPARATOR);
		sortAndFind.sortByName();
	}
}
