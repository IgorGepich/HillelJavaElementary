package ua.hillel.lessons.lesson09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;


public class Message {
	private String phoneNumber;
	private String messageText;

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getMessageText() {
		return messageText;
	}

	Message(String phoneNumber, String messageText) {
		this.phoneNumber = phoneNumber;
		this.messageText = messageText;
	}

	Message(){}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Message)) return false;
		Message message = (Message) o;
		return getPhoneNumber().equals(message.getPhoneNumber()) &&
				getMessageText().equals(message.getMessageText()) &&
				findMessageValues.equals(message.findMessageValues);
	}

	@Override
	public int hashCode() {
		return Objects.hash(getPhoneNumber(), getMessageText(), findMessageValues);
	}

	public String toString(){
		StringBuilder messageStringBuilder = new StringBuilder();
			messageStringBuilder.append("Contact name: ")
								.append(getPhoneNumber())
								.append(" Message text: ")
								.append(getMessageText());
		return messageStringBuilder.toString();
	}

	List<Message> findMessageValues = new ArrayList<>();
	Collection<Message> findInMessages(Collection<Message> messageList, String fieldToFind) {
		for (Message foundField : messageList) {
			if(foundField.getPhoneNumber().toLowerCase().contains(fieldToFind.toLowerCase())
					|| foundField.getMessageText().toLowerCase().contains(fieldToFind.toLowerCase())){
				findMessageValues.add(foundField);
			}
		}
		return findMessageValues;
	}

	public void printMessageToCLI(){
		System.out.println(findMessageValues.toString());
	}
}
