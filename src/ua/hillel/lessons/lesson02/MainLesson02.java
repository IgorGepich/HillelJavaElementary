package ua.hillel.lessons.lesson02;

/**
 * @autor Ihor Sutulov
 * @return Odject Student with String field Name and Int field Age
 * @version 1.0
 */

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
