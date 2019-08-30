package ua.hillel.lessons.kata;
/*
This method give user opportunity to check can the entered number divisible by three or not
 */

import java.util.Scanner;

public class DivisibleByThree {

	public void byThreeOrNotByThree() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number, you wont to check for divisible by three: ");
		String numberFromUser = scanner.nextLine();
		int digitSum = 0;

// iterate over the entered number and assign to a variable digitSum the sum of the numbers the user entered
		for (int i = 0; i < numberFromUser.length(); i++) {
			digitSum = digitSum + numberFromUser.charAt(i);
		}
// check if variable digitSum is divisible by 3
		if (digitSum % 3 == 0) {
			System.out.println("This number is divisible by 3");
		}
		else {
			System.out.println("This number is not divisible by 3");
		}
	}
}
