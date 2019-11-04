package ua.hillel.lessons.lesson13;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Contact implements Serializable {
	private String firstName;
	private String lastName;
	private String phoneNumber;

	private Contact(String firstName, String lastName, String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	Contact() {
	}

	@Override
	public String toString(){
		return "\nFirst name: " + firstName + "\nLast name: " + lastName + "\nPhone number: " + phoneNumber;
	}

	private List<Contact> getContacts() {
		List<Contact> contacts = new ArrayList<>();
		contacts.add(new Contact("Igor", "Ivanoff", "+38098765003"));
		contacts.add(new Contact("Konstantin", "Kocenbogen", "+38098765003"));
		contacts.add(new Contact("Igor", "Petrov", "+380671234567"));
		contacts.add(new Contact("Igor", "Kruzenshtern", "+38098765433"));
		contacts.add(new Contact("Ivan", "Sidorov", "+380672434567"));
		contacts.add(new Contact("Vasiliy", "Pupkin", "+380971234567"));
		contacts.add(new Contact("Petr", "Ivanov", "+380682334567"));
		return contacts;
	}

	//Fourth task
		//* write Contact in File by String
	void writeContactInFile(){
		try(DataOutputStream contactCollection = new DataOutputStream(
				new FileOutputStream("contacts.bin"))){
					for(Contact contact : getContacts()){
						contactCollection.writeUTF(String.format("%s, %s, %s", contact.firstName, contact.lastName,
								contact.phoneNumber));
					}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void readContactFromFile(){
		try(DataInputStream contactCollection = new DataInputStream(
				new FileInputStream("contacts.bin"))){
					while (contactCollection.available() > 0){
						System.out.println(contactCollection.readUTF());
					}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//end fourth task

	// Fifth task Object
		//* write Contact Collection in .bin file
	void writeContactsInFile(){
		try(ObjectOutputStream contactsColl = new ObjectOutputStream(
				new FileOutputStream("contacts_object_collection.bin"))){
					for (Contact contact : getContacts()){
						contactsColl.writeObject(contact);
					}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	void readContactsFromFile(){
		List<Contact> contactsFromBin = new ArrayList<>();
		try(FileInputStream fileInputStream = new FileInputStream("contacts_object_collection.bin")) {
			ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
				while (fileInputStream.available() > 0){
					contactsFromBin.add((Contact) inputStream.readObject());
				}
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(contactsFromBin.toString());
	}

	// Count files in a directory
	 int countFiles(String path){
		try (Stream<Path> walk = Files.walk(Paths.get(path))) {
			List<String> result = walk.filter(Files::isRegularFile)
					.map(x -> x.toString()).collect(Collectors.toList());
			System.out.println("Files in a directory: " + result.size());
			return result.size();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
