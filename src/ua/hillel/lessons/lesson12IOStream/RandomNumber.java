package ua.hillel.lessons.lesson12IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class RandomNumber {
	void writeNumberInFile(){
		try (PrintWriter writer = new PrintWriter(
				new FileOutputStream("random_number.txt"))){
			int iter = 1;
			while (iter <= 1000){
				int number = (int) (Math.random() * (650 - (-500) + 1) + (-500));
				writer.print(number + ", ");
				iter++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private List<Integer> firstOneHundredNumber = new ArrayList<>();
	void readNumberFromFile() {
		try(Scanner numberScanner = new Scanner(
				new FileInputStream("random_number.txt"), StandardCharsets.UTF_8.name())){
			numberScanner.useDelimiter(", ");
			int iterator = 1;
			while (iterator <= 100){
				numberScanner.hasNextInt();
				firstOneHundredNumber.add(numberScanner.nextInt());
				iterator++;
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	void average(){
		int counter = 0;
		int sum = 0;
		int averageOfArray;
		List<Integer> positiveNumbersArray = new ArrayList<>();
		for (int iterator : firstOneHundredNumber){
			if(iterator > 0) {
				positiveNumbersArray.add(iterator);
				sum += iterator;
				counter++;
			}
		}
		averageOfArray = sum/counter;
		System.out.println("Average of array: " + averageOfArray);
	}
}
