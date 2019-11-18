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
			int iterator = 1;
			writer.print(1000);
			while (iterator <= 1000){
				int number = (int) (Math.random() * (650 - (-500) + 1) + (-500));
				writer.print(number + ", ");
				iterator++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	List<Integer> readNumberFromFile() {
			List<Integer> firstOneHundredNumber = new ArrayList<>();
		try(Scanner numberScanner = new Scanner(
				new FileInputStream("random_number.txt"), StandardCharsets.UTF_8.name())){
			numberScanner.useDelimiter(", ");
			int iterator = 1;
			while (numberScanner.hasNext() && iterator <= 100){
				firstOneHundredNumber.add(numberScanner.nextInt());
				iterator++;
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return firstOneHundredNumber;
	}

	void average(List<Integer> integerList){
		int counter = 0;
		int sum = 0;
		double averageOfArray;
		for (int number : integerList){
			if(number >= 0) {
				sum += number;
				counter++;
			}
		}
		averageOfArray = (double) sum/counter;
		System.out.println("Average of array: " + averageOfArray);
	}
}
