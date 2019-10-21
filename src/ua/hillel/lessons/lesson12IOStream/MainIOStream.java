package ua.hillel.lessons.lesson12IOStream;

public class MainIOStream {
	public static void main(String[] args) {

		PrintInFileHelloWorld printInFile = new PrintInFileHelloWorld();
		printInFile.writeInFile();

		RandomNumber randomNumber = new RandomNumber();
		randomNumber.writeNumberInFile();
		randomNumber.readNumberFromFile();
		randomNumber.average();

		HumanContact humanContact = new HumanContact();
		humanContact.writeContactInFile();
//		humanContact.readContactFromFile();
		humanContact.readContactFromFileScanner();
		humanContact.printer();
	}
}
