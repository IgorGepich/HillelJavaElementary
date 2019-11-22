package ua.hillel.lessons.lesson09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;


public class Message {
	private String subscriberName;
	private String messageText;

	private String getSubscriberName() {
		return subscriberName;
	}

	private String getMessageText() {
		return messageText;
	}

	Message(String subscriberName, String messageText) {
		this.subscriberName = subscriberName;
		this.messageText = messageText;
	}

	Message(){}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Message)) return false;
		Message message = (Message) o;
		return getSubscriberName().equals(message.getSubscriberName()) &&
				getMessageText().equals(message.getMessageText()) &&
				findMessageValues.equals(message.findMessageValues);
	}

	@Override
	public int hashCode() {
		return Objects.hash(getSubscriberName(), getMessageText(), findMessageValues);
	}

	public String toString(){
		StringBuilder messageStringBuilder = new StringBuilder();
			messageStringBuilder.append("Contact name: ")
								.append(getSubscriberName())
								.append(" Message text: ")
								.append(getMessageText());
		return messageStringBuilder.toString();
	}

	List<Message> findMessageValues = new ArrayList<>();
	Collection<Message> findInMessages(Collection<Message> messageList, String fieldToFind) {
		for (Message foundField : messageList) {
			if(foundField.getSubscriberName().toLowerCase().contains(fieldToFind.toLowerCase())
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
