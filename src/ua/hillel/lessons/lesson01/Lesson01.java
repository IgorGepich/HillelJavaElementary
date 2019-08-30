package ua.hillel.lessons.lesson01;

import ua.hillel.lessons.Constants;

import java.util.Arrays;

public class Lesson01 {
	private int a = 2;
	private int b = 3;
	public void minMax() {
		System.out.println(Constants.PROGRAM_NAME + "01 Task. MIN MAX for two digit");
		if (a > b) {
			System.out.println("a bigger than b");
		}
		else {
			System.out.println("b bigger than a");
		}
		System.out.println(Constants.LINE_SEPARATOR);
	}
	private int year = 2012;
	private int century;
	public void centuryYear(){
		System.out.println(Constants.PROGRAM_NAME + "02 Task. Determine the century for a given year");
		century = year / 100;
		System.out.println(century);
	}
	public void highYear(){
		boolean isHighYear = ((year % 4 == 0 ) && (year % 100 !=0) || (year % 400 == 0));
			if (isHighYear){
				System.out.println(year + " is high year.");
			}
			else {
				System.out.println(year + " is not high year.");
			}
		System.out.println(Constants.LINE_SEPARATOR);
	}
	private int[] array = new int[10];
	public void firstArray() {
		System.out.println(Constants.PROGRAM_NAME + "04 Task. Fill in integer array");
		for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++){
			array[arrayIndex] = arrayIndex + 1;
			System.out.println(Arrays.toString(array));
			System.out.println(Constants.LINE_SEPARATOR);
		}
	}
	public void twoDigitAfter() {
		System.out.println(Constants.PROGRAM_NAME + "05 Task. Line array output");
		float[] floatArray = new float[]{2.1212f, 3.1212f, 5.1543f, 5.5345635f};
		for (int i = 0; i <floatArray.length; i++){
			System.out.printf("%.2f ", floatArray[i]);
			System.out.println("\n" + Constants.LINE_SEPARATOR);
		}
	}
	private int digit = 15343;
	private int sumDigit;
	public void digitSumm(){
		System.out.println(Constants.PROGRAM_NAME + "06 Task. Sum of digits of a number");
		while (digit != 0){
			sumDigit += (digit % 10);
			digit /=10;
			System.out.println(sumDigit);
		}
	}
}

