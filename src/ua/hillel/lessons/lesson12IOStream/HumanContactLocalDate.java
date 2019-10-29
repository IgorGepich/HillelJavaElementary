package ua.hillel.lessons.lesson12IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class HumanContactLocalDate {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private LocalDate dateOfBirth;

	private List<HumanContactLocalDate> humanContacts = new ArrayList<>();

	private HumanContactLocalDate(String firstName, String lastName, String phoneNumber, LocalDate dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
	}

	HumanContactLocalDate() {
		this.dateOfBirth = LocalDate.now();
	}

	@Override
	public String toString() {
		return firstName + " / " + lastName + " / " + phoneNumber + " / " + dateOfBirth + "\n";
	}

	void writeContactInFileLocalDate() {
		try (PrintWriter writer = new PrintWriter(
				new FileOutputStream("contact_list_local_date.txt"))){
			writer.print(new HumanContactLocalDate("TestName", "TestLastName", "123",
					LocalDate.of(2000, 1, 20)));

//			writer.print(new HumanContactLocalDate("Konstantin", "Kocenbogen", "+38098765003",
//					LocalDate.of(2019, 01, 20)));
//			writer.print(new HumanContactLocalDate("Natasha", "Oladushkina", "+38098555433",
//					LocalDate.of(2019, 01, 20)));
//			writer.print(new HumanContactLocalDate("Igor", "Kruzenshtern", "+38098765433",
//					LocalDate.of(2019, 01, 20)));
//			writer.print(new HumanContactLocalDate("Igor", "Petrov", "+380671234567",
//					LocalDate.of(2019, 01, 20)));
//			writer.print(new HumanContactLocalDate("Slava", "Abramovich", "+380987766555",
//					LocalDate.of(2019, 01, 20)));
//			writer.print(new HumanContactLocalDate("Ivan", "Sidorov", "+380672434567",
//					LocalDate.of(2019, 01, 20)));
//			writer.print(new HumanContactLocalDate("Vasiliy", "Pupkin", "+380971234567",
//					LocalDate.of(2019, 01, 20)));
//			writer.print(new HumanContactLocalDate("Petr", "Ivanov", "+380682334567",
//					LocalDate.of(2019, 01, 20)));
//			writer.print(new HumanContactLocalDate("Katerina", "Pupsikova", "+380672554567",
//					LocalDate.of(2019, 01, 20)));
//			writer.print(new HumanContactLocalDate("Anastasia", "Dnestrovaya", "+380682338867",
//					LocalDate.of(2019, 01, 20)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	void readContactFromFileScannerLocalDate(){
		try (Scanner contactScanner = new Scanner(
				new FileInputStream("contact_list_local_date.txt"), StandardCharsets.UTF_8.name())) {
			contactScanner.useDelimiter(" [/\n]");
			while (contactScanner.hasNext()) {
				humanContacts.add(new HumanContactLocalDate(contactScanner.next(), contactScanner.next(), contactScanner.next(),
						LocalDate.parse(contactScanner.next().trim(), DateTimeFormatter.ofPattern("yyyy-MM-dd"))));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	void printer(){
		System.out.println(humanContacts.toString());
		printFirstFiveContactsLocalDate();
		System.out.println("My date " + dateOfBirth.toString());
	}

	private void printFirstFiveContactsLocalDate(){
		Iterator humanIterator = humanContacts.iterator();
		int i = 0;
		while (humanIterator.hasNext()){
			if(i ++== 5) break;
			System.out.print(humanIterator.next());
		}
	}
}