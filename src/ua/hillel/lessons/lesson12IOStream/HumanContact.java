package ua.hillel.lessons.lesson12IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

public class HumanContact {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private GregorianCalendar birthDay;

	private SimpleDateFormat formatForDateOf = new SimpleDateFormat("dd.MM.yyyy");

	private List<HumanContact> humanContacts = new ArrayList<>();

	private HumanContact(String firstName, String lastName, String phoneNumber, GregorianCalendar birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.birthDay = birthDate;
	}

	HumanContact() {
	}

	private GregorianCalendar getBirthDay() {
		return birthDay;
	}

	@Override
	public String toString() {
		return firstName + " / " + lastName + " / " + phoneNumber + " / "
				+ formatForDateOf.format(birthDay.getTime()) + "\n";
	}

	/**
	 * Write contacts with fields: firstName, lastName, phoneNumber, birthDay in file contact_list.txt
	 */
	void writeContactInFile() {
		try (PrintWriter writer = new PrintWriter(
				new FileOutputStream("contact_list.txt"))) {
			writer.print(new HumanContact("Konstantin", "Kocenbogen", "+38098765003",
					birthDay = new GregorianCalendar(1989, Calendar.AUGUST, 21)));
			writer.print(new HumanContact("Natasha", "Oladushkina", "+38098555433",
					birthDay = new GregorianCalendar(1988, Calendar.APRIL, 7)));
			writer.print(new HumanContact("Igor", "Kruzenshtern", "+38098765433",
					birthDay = new GregorianCalendar(1987, Calendar.JUNE, 9)));
			writer.print(new HumanContact("Igor", "Petrov", "+380671234567",
					birthDay = new GregorianCalendar(1980, Calendar.JULY, 6)));
			writer.print(new HumanContact("Slava", "Abramovich", "+380987766555",
					birthDay = new GregorianCalendar(1967, Calendar.JULY, 25)));
			writer.print(new HumanContact("Ivan", "Sidorov", "+380672434567",
					birthDay = new GregorianCalendar(1987, Calendar.JANUARY, 16)));
			writer.print(new HumanContact("Vasiliy", "Pupkin", "+380971234567",
					birthDay = new GregorianCalendar(1999, Calendar.OCTOBER, 12)));
			writer.print(new HumanContact("Petr", "Ivanov", "+380682334567",
					birthDay = new GregorianCalendar(1995, Calendar.DECEMBER, 15)));
			writer.print(new HumanContact("Katerina", "Pupsikova", "+380672554567",
					birthDay = new GregorianCalendar(2000, Calendar.MARCH, 20)));
			writer.print(new HumanContact("Anastasia", "Dnestrovaya", "+380682338867",
					birthDay = new GregorianCalendar(1995, Calendar.FEBRUARY, 12)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param dataFromFile
	 * @return gc - object of Gregorian Calendar
	 * @throws ParseException
	 */
	private GregorianCalendar getMyCalendar(String dataFromFile) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		Date date = format.parse(dataFromFile); // scanner.NextLine()
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		return gc;
	}

	/**
	 * Read fields from file and add it to humanContacts Array
	 */
	void readContactFromFileScanner() {
		Pattern pattern = Pattern.compile("[/\n]");
		try (Scanner contactScanner = new Scanner(
			new FileInputStream("contact_list.txt"), StandardCharsets.UTF_8.name())) {
			contactScanner.useDelimiter(pattern);
			while (contactScanner.hasNext()) {
				humanContacts.add(new HumanContact(contactScanner.next(), contactScanner.next(), contactScanner.next(),
						getMyCalendar(contactScanner.next())));
			}
		} catch (FileNotFoundException | ParseException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Compare objects in humanContact Array by date of birthday field.
	 */
	private static Comparator<HumanContact> CompareByBirthday = (human1, human2) -> {
		int result = human1.getBirthDay().compareTo(human2.getBirthDay());
		return result;
	};

	void printer() {
		//Print unsorted Array.
		System.out.println(humanContacts.toString());
		//Sort Array.
		humanContacts.sort(HumanContact.CompareByBirthday);
		//Print sorted Array.
		System.out.println(humanContacts.toString());
	}

	/**
	 * Print first five contacts from sorted Array humanContacts.
	 */
	void printFirstFiveContacts(){
		Iterator humanIterator = humanContacts.iterator();
		int i = 0;
		while (humanIterator.hasNext()){
			if(i ++== 5) break;
			System.out.print(humanIterator.next());
		}
	}
}




