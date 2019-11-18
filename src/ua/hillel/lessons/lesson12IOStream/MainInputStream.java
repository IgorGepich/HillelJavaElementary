package ua.hillel.lessons.lesson12IOStream;

import java.util.List;

public class MainInputStream {
	public static void main(String[] args) {
		/**
		 * Main entry point for Input Stream
		 */

		RandomNumber randomNumber = new RandomNumber();
		randomNumber.writeNumberInFile();
		List<Integer> integers = randomNumber.readNumberFromFile();
		randomNumber.average(integers);

		HumanContact humanContact = new HumanContact();
		humanContact.runInputStream();

	}
}
