package ua.hillel.lessons.lesson13;

public class MainLesson13 {
	public static void main(String[] args) {

		WriteDifferentType writeDifferentType = new WriteDifferentType();
		writeDifferentType.writeBinFile();
		writeDifferentType.readBinFile();
		writeDifferentType.writeStringCollectionInFile();
		writeDifferentType.readStringCollectionFromFile();

		Contact contact = new Contact();
		contact.writeContactInFile();
		contact.readContactFromFile();
		contact.writeContactsInFile();
		contact.readContactsFromFile();
		//Local path to directory
		contact.countFiles("/Users/igor/IdeaProjects/HillelPractice/src/ua/hillel/lessons/lesson13/IOFiles");
	}
}
