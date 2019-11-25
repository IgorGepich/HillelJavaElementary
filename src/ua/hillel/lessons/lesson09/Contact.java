package ua.hillel.lessons.lesson09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Contact {
	private String subscriberName;
	private String phoneNumber;

	Contact(String subscriberName, String phoneNumber) {
		this.subscriberName = subscriberName;
		this.phoneNumber = phoneNumber;
	}

	Contact(){}

	String getSubscriberName() {
		return subscriberName;
	}

	String getPhoneNumber() {
		return phoneNumber;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Contact)) return false;
		Contact contact = (Contact) o;
		return getSubscriberName().equals(contact.getSubscriberName()) &&
				getPhoneNumber().equals(contact.getPhoneNumber()) &&
				findContactValues.equals(contact.findContactValues);
	}

	@Override
	public int hashCode() {
		return Objects.hash(getSubscriberName(), getPhoneNumber(), findContactValues);
	}

	public String toString(){
		String stringBuilder = "Contact name: " +
				getSubscriberName() +
				" Contact number: " +
				getPhoneNumber();
		return stringBuilder;
	}

	/**
	 * Find method
	 */

	private List<Contact> findContactValues = new ArrayList<>();
	void findInContacts(Collection<Contact> contactList, String fieldToFind) {
		for (Contact foundField : contactList) {
			if(foundField.getPhoneNumber().contains(fieldToFind)
				|| foundField.getSubscriberName().toLowerCase().contains(fieldToFind.toLowerCase())){
				findContactValues.add(foundField);
			}
		}
	}

	public void printerToCLI(){
		System.out.println(findContactValues.toString());
	}
}
