package ua.hillel.lessons.lesson12IOStream;

public class MainInputStream {
	public static void main(String[] args) {
		/**
		 * Main entry point for Input Stream
		 */

		RandomNumber randomNumber = new RandomNumber();
		randomNumber.readNumberFromFile();
		randomNumber.average();

		HumanContact humanContact = new HumanContact();
		humanContact.runInputStream();

	}
}
