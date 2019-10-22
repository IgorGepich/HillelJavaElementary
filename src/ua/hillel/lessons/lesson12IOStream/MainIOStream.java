package ua.hillel.lessons.lesson12IOStream;

import java.text.ParseException;

public class MainIOStream {
	public static void main(String[] args) throws ParseException {

		PrintInFileHelloWorld printInFile = new PrintInFileHelloWorld();
		printInFile.writeInFile();

		RandomNumber randomNumber = new RandomNumber();
		randomNumber.writeNumberInFile();
		randomNumber.readNumberFromFile();
		randomNumber.average();

		HumanContact humanContact = new HumanContact();
		humanContact.writeContactInFile();
		humanContact.readContactFromFileScanner();
		humanContact.printer();
		humanContact.printFirstFiveContacts();
	}
}
