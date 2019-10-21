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

public class HumanContact  {
	private String firstName;
	private String lastName;
	private String phoneNumber;

	private GregorianCalendar birthDate;
	private SimpleDateFormat formatForDateOf = new SimpleDateFormat("dd.MM.yyyy");

	private List<HumanContact> humanContacts = new ArrayList<>();

	private HumanContact(String firstName, String lastName, String phoneNumber, GregorianCalendar birthDate) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
	}

	HumanContact() {
	}

	public GregorianCalendar getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(GregorianCalendar birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return firstName + " / " + lastName + " / " + phoneNumber + " / "
				+ formatForDateOf.format(birthDate.getTime()) + "\n";
	}

	void writeContactInFile() {
		try (PrintWriter writer = new PrintWriter(
				new FileOutputStream("contact_list.txt"))) {
			writer.print(new HumanContact("Slava", "Abramovich", "+380987766555",
					birthDate = new GregorianCalendar(1967, Calendar.JULY, 25)));
			writer.print(new HumanContact("Konstantin", "Kocenbogen", "+38098765003",
					birthDate = new GregorianCalendar(1989, Calendar.AUGUST, 21)));
			writer.print(new HumanContact("Natasha", "Oladushkina", "+38098555433",
					birthDate = new GregorianCalendar(1988, Calendar.APRIL, 7)));
			writer.print(new HumanContact("Igor", "Kruzenshtern", "+38098765433",
					birthDate = new GregorianCalendar(1987, Calendar.JUNE, 9)));
			writer.print(new HumanContact("Igor", "Petrov", "+380671234567",
					birthDate = new GregorianCalendar(1980, Calendar.JULY, 6)));
			writer.print(new HumanContact("Ivan", "Sidorov", "+380672434567",
					birthDate = new GregorianCalendar(1987, Calendar.JANUARY, 16)));
			writer.print(new HumanContact("Vasiliy", "Pupkin", "+380971234567",
					birthDate = new GregorianCalendar(1999, Calendar.OCTOBER, 12)));
			writer.print(new HumanContact("Petr", "Ivanov", "+380682334567",
					birthDate = new GregorianCalendar(1995, Calendar.DECEMBER, 15)));
			writer.print(new HumanContact("Katerina", "Pupsikova", "+380672554567",
					birthDate = new GregorianCalendar(2000, Calendar.MARCH, 20)));
			writer.print(new HumanContact("Anastasia", "Dnestrovaya", "+380682338867",
					birthDate = new GregorianCalendar(1995, Calendar.FEBRUARY, 12)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	private GregorianCalendar getMyCalendar(String dataFromFile) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		Date date = format.parse(dataFromFile); // scanner.NextLine()
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);
		return gc;
	}

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

	void printer() {
		System.out.println(humanContacts.toString());
	}
}





