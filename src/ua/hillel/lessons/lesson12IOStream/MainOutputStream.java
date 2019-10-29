package ua.hillel.lessons.lesson12IOStream;

public class MainOutputStream {
	/**
	 * The main entry point.
	 */
	public static void main(String[] args) {
		/**
		 * First Part of the hometask.
		 */
		PrintInFileHelloWorld printInFile = new PrintInFileHelloWorld();
		printInFile.writeInFile();

		/**
		 * Second Part of the hometask.
		 */
		RandomNumber randomNumber = new RandomNumber();
		randomNumber.writeNumberInFile();



		/**
		 * Third part of the hometask local Date.
		 */
		HumanContactLocalDate humanContactLocalDate = new HumanContactLocalDate();
		humanContactLocalDate.writeContactInFileLocalDate();
		humanContactLocalDate.readContactFromFileScannerLocalDate();
		humanContactLocalDate.printer();

		/**
		 * Third part of the hometask gregorian calendar.
		 */
		HumanContact humanContact = new HumanContact();
		humanContact.runOutputStream();

	}
}
