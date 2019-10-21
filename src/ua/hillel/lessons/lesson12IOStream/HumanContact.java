package ua.hillel.lessons.lesson12IOStream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;
import java.util.Date;

public class HumanContact {
	String firstName;
	String lastName;
	String phoneNumber;
	String dateOfBirth;

	private Date birthdate ;

//	private GregorianCalendar dateOf = new GregorianCalendar(1980, 4, 24);
	private GregorianCalendar dateOf;
	SimpleDateFormat formatForDateOf = new SimpleDateFormat("yyyy.MM.dd");


//	private List<HumanContact> contacts = new ArrayList<>();
	private List<HumanContact> humanContacts = new ArrayList<>();

	public HumanContact(String firstName, String lastName, String phoneNumber, String dateOfBirth) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.dateOfBirth = dateOfBirth;
	}

	public HumanContact(String firstName, String lastName, String phoneNumber, Date birthdate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.birthdate = birthdate;
	}

	public HumanContact(String firstName, String lastName, String phoneNumber, GregorianCalendar dateOf) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.dateOf = dateOf;
	}

	public HumanContact() {
		this.dateOf = new GregorianCalendar(323,3,12);
	}



	@Override
	public String toString() {
		return firstName + " / " + lastName + " / " + phoneNumber + " / " + dateOf.getTime() + "\n";
	}


//	List fillContactList(){
//		contacts.add(new HumanContact("Igor", "Petrov", "+380671234567", "01 january 1980"));
//		contacts.add(new HumanContact("Petr", "Ivanov", "+380682334567", ""));
//		contacts.add(new HumanContact("Ivan", "Sidorov", "+380672434567", ""));
//		contacts.add(new HumanContact("Vasiliy", "Pupkin", "+380971234567", ""));
//		contacts.add(new HumanContact("TestName", "vcv", "123",
//				birthdate = new Date(331231233)));
//		return contacts;
//	}

	void writeContactInFile(){
		try (PrintWriter writer = new PrintWriter(
				new FileOutputStream("contact_list.txt"))){
//			writer.print(new HumanContact("Igor","Kruzenshtern", "+38098765433",
//					"10 of march 2019"));
//			writer.print(new HumanContact("Igor", "Petrov", "+380671234567",
//					"01 of january 1980"));
//			writer.print(new HumanContact("Ivan", "Sidorov", "+380672434567",
//					"05 of january 1985"));
//			writer.print(new HumanContact("Vasiliy", "Pupkin", "+380971234567",
//					"06 of october 1980"));
//			writer.print(new HumanContact("Petr", "Ivanov", "+380682334567",
//					"11 of december 1995"));
//			writer.print(new HumanContact("Test", "vcv", "1233434",
//					dateOfBirth = new Date(12312432342L).toString()));
			writer.print(new HumanContact("TestName", "TestLastName", "123",
//					this.dateOf = new GregorianCalendar(1968, 9, 15)));
//					dateOf));
//					this.birthdate = new Date(2434234234234L)));
					new GregorianCalendar(343, 3, 12)));

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

//	private List<String> contactList = new ArrayList<>();

//	void readContactFromFile() {
//		try(BufferedReader reader = new BufferedReader(
//				new InputStreamReader(
//						new FileInputStream("contact_list.txt"), StandardCharsets.UTF_8))) {
//			String line;
//
//			while ((line = reader.readLine()) != null){
//				contactList.add(line);
//				humanContacts.add(new HumanContact(line, line, line, line));
//			}
//			System.out.println(humanContacts.toString());
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}


	void readContactFromFileScanner() {
		Pattern pattern = Pattern.compile("\\/|\n");
		try(Scanner contactScanner = new Scanner(
				new FileInputStream("contact_list.txt"), StandardCharsets.UTF_8.name())){
			contactScanner.useDelimiter(pattern);
			while (contactScanner.hasNext()){
				humanContacts.add(new HumanContact(contactScanner.next(), contactScanner.next(), contactScanner.next(),
						contactScanner.nextLine()));
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void printer(){
		System.out.println(humanContacts.toString());
//		System.out.println("My date " + formatForDateOf.format(dateOf.getTime()));
	}
}
