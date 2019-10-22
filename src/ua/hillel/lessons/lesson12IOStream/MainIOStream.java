package ua.hillel.lessons.lesson12IOStream;

public class MainIOStream {
	/**
	 * The main entry point.
	 */
	public static void main(String[] args){
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
		randomNumber.readNumberFromFile();
		randomNumber.average();

		/**
		 * Third part of the hometask.
		 */
		HumanContact humanContact = new HumanContact();
		humanContact.writeContactInFile();
		humanContact.readContactFromFileScanner();
		humanContact.printer();
		humanContact.printFirstFiveContacts();
	}
}
