package ua.hillel.lessons.lesson09;

import java.time.LocalDate;
import java.util.*;


public class MainLesson09 {
	/**
	 * The main entry point.
	 */
	public static void main(String[] args) {

		/**
		 * Create Contact list
		 */

		List<Contact> contactList = new ArrayList<>();
		contactList.add(new Contact("Slava", "+380671234567"));
		contactList.add(new Contact("Nastia", "+380501234567"));
		contactList.add(new Contact("Igor", "+380630123456"));
		contactList.add(new Contact("Vasiliy", "+380971234567"));
		contactList.add(new Contact("Vasilisa", "+380731234567"));
		contactList.add(new Contact("Egor", "+3806737654321"));
		contactList.add(new Contact("Mark", "+380507654321"));
		contactList.add(new Contact("Sasha", "+380737654321"));
		contactList.add(new Contact("Masha", "+380502123456"));
		contactList.add(new Contact("Aleksandr", "+3806712332145"));
		contactList.add(new Contact("Viktor", "+380977657432"));
		contactList.add(new Contact("Elena", "+380632334567"));

		/**
		 * Create Call Log List
		 */

		List<CallLog> callLogList = new ArrayList<>();
		callLogList.add(new CallLog("+380671234567", LocalDate.of(2019,8,1)));
		callLogList.add(new CallLog("+380671234567", LocalDate.of(2019,1,4)));
		callLogList.add(new CallLog("+380501234567", LocalDate.of(2019,9,5)));
		callLogList.add(new CallLog("+380671234567", LocalDate.of(2019,9,6)));
		callLogList.add(new CallLog("+380971234567", LocalDate.of(2019, 9, 7)));
		callLogList.add(new CallLog("+380731234567", LocalDate.of(2019, 10, 7)));
		callLogList.add(new CallLog("+380731234567", LocalDate.of(2019, 9, 7)));
		callLogList.add(new CallLog("+380673212323", LocalDate.now().minusDays(2)));
		callLogList.add(new CallLog("+380673212323", LocalDate.of(2019, 12, 21)));

		/**
		 * Create Message list
		 */

		List<Message> messageList = new ArrayList<>();
		messageList.add(new Message("+380671234567", "Hi"));
		messageList.add(new Message("+380671234567", "Hi, how are you?"));
		messageList.add(new Message("+380971234567", "Call me"));
		messageList.add(new Message("+380731234567", "Sorry, I'm late"));
		messageList.add(new Message("+380673212323", "Happy Birthday my dear friend"));

		Contact findInContactsValues = new Contact();
		findInContactsValues.findInContacts(contactList, "i");
//		findInContactsValues.printerToCLI();

		Message findInMessageValues = new Message();
		findInMessageValues.findInMessages(messageList, "Hi");
//		findInMessageValues.printMessageToCLI();


		/**
		 * 04 Task print on screen
		 */
		Map<Contact, List<CallLog>> callLogGroup;
		callLogGroup = CombiningContactCallLog(contactList, callLogList);
		System.out.println("MAP:");
		for (Map.Entry<Contact, List<CallLog>> item: callLogGroup.entrySet()) {
				System.out.println("Contact name: " + item.getKey().getSubscriberName()
						+ " call number: " + item.getValue().size());
		}
	/**
	* End 04 Task
	*/
	/**
	 * Task 05
	 */

		System.out.println("Task 5");
		Comparator<Map.Entry<Contact, List<CallLog>>> sizeComparator =
				Comparator.comparingInt(value -> value.getValue().size());
				callLogGroup.entrySet()
				.stream()
				.sorted(sizeComparator.reversed())
				.limit(5)
				.forEach(element -> {
					System.out.println("Contact name: " + element.getKey().getSubscriberName() + " Logs: " + element.getValue().size());
				});


		/**
		 * Task 05 Pair
		 */
		List<Pair<Contact, List<CallLog>>> listOfTopFiveCallLogs = new ArrayList<>();
		for(Contact contact : contactList){
			List<CallLog> tempCallLogs = new ArrayList<>();
				for(CallLog callLog : callLogList){
					if (contact.getPhoneNumber().equals(callLog.getPhoneNumber())){
						tempCallLogs.add(callLog);
					}
				}
			listOfTopFiveCallLogs.add(new Pair<>(contact, tempCallLogs));
		}
		listOfTopFiveCallLogs.sort(((o1, o2) -> Integer.compare(o2.getValue2().size(), o1.getValue2().size())));
		int max = Math.min(listOfTopFiveCallLogs.size(), 5);
		for(Pair<Contact, List<CallLog>> singlePair : listOfTopFiveCallLogs){
			if (max-- == 0){
				break;
			}
			System.out.println(singlePair.getValue1().getSubscriberName() + " " + singlePair.getValue2().size());
		}
		/**
		 * End
		 */

		/**
		 * 06 - 07 Task print on screen
		 * Combining Contacts & Messages
		 */
		Map<Contact, List<Message>> messagesGroup;
		messagesGroup = CombiningContactMessages(contactList, messageList);
		System.out.println("Task 7 Messages");
		Comparator<Map.Entry<Contact, List<Message>>> sizeComparator1 =
				Comparator.comparingInt(value -> value.getValue().size());
		messagesGroup.entrySet()
				.stream()
				.sorted(sizeComparator1.reversed())
				.limit(5)
				.forEach(element -> {
					System.out.println("Contact name: " + element.getKey().getSubscriberName() + " Messages: " + element.getValue().size());
				});

		/**
		 * End 06 - 07 Task
		 */
	//Main end
	}

	/**
	 * Task 4 Combine call for contact
	 */

	private static Map<Contact, List<CallLog>> CombiningContactCallLog
				(List<Contact> contactList, List<CallLog> callLogList)
	{
		Map<Contact, List<CallLog>> resultCombiningContactCallLog = new HashMap<>();
		for (Contact contact: contactList) {
			List<CallLog> resultOfCallLogs = new ArrayList<>();
			for (CallLog callLog: callLogList) {
				if(contact.getPhoneNumber().equals(callLog.getPhoneNumber())){
					resultOfCallLogs.add(callLog);
				}
			}
			resultCombiningContactCallLog.put(contact, resultOfCallLogs);
		}
			return resultCombiningContactCallLog;
	}
	/**
	 * END Task 4 Combine call for contact
	 */

	/**
	 *
	 */
	private static Map<Contact, List<Message>> CombiningContactMessages
	(List<Contact> contactList, List<Message> messageList)
	{
		Map<Contact, List<Message>> resultCombiningContactMessages = new HashMap<>();

		for (Contact contact: contactList) {
			List<Message> resultOfMessages = new ArrayList<>();
			for (Message message: messageList) {
				if(contact.getPhoneNumber().equals(message.getPhoneNumber())){
					resultOfMessages.add(message);
				}
			}
			resultCombiningContactMessages.put(contact, resultOfMessages);
		}
		return resultCombiningContactMessages;
	}
}
