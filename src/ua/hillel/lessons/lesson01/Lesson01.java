package ua.hillel.lessons.lesson01;

import ua.hillel.lessons.Constants;

import java.util.Arrays;

public class Lesson01 {
	private int a = 2;
	private int b = 3;
	public void minMax() {
		if (a > b) {
			System.out.println("a bigger then b");
		}
		else {
			System.out.println("b bigger then a");
		}
		System.out.println(Constants.LINE_SEPARATOR);
	}

	private int year = 2012;
	private int century;

	public void centuryYear(){
		century = year / 100;
		System.out.println(century);
	}

	public void highYear(){
		boolean isHighYear = ((year % 4 == 0 ) && (year % 100 !=0) || (year % 400 == 0));
			if (isHighYear){
				System.out.println(year + " is high year.");
			}
			else {
				System.out.println(year + " is not high year>");
			}
		System.out.println(Constants.LINE_SEPARATOR);
	}

	public int[] array = new int[10];
	public void firstArray() {
		for (int arrayIndex = 0; arrayIndex < array.length; arrayIndex++){
			array[arrayIndex] = arrayIndex + 1;
			System.out.println(Arrays.toString(array));
			System.out.println(Constants.LINE_SEPARATOR);
		}
	}

	public void twoDigitAfter() {
		float[] floatArray = new float[]{2.1212f, 3.1212f, 5.1543f, 5.5345635f};
		for (int i = 0; i <floatArray.length; i++){
			System.out.printf("%.2f ", floatArray[i]);
			System.out.println(Constants.LINE_SEPARATOR);
		}
	}
	public int digit = 15343;
	int sumDigit;
	public void digitSumm(){
		while (digit != 0){
			sumDigit += (digit % 10);
			digit /=10;
			System.out.println(sumDigit);
		}
	}




}

