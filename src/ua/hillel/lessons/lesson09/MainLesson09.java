package ua.hillel.lessons.lesson09;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
		callLogList.add(new CallLog("+380501234567", LocalDate.of(2019,9,5)));
		callLogList.add(new CallLog("+380630123456", LocalDate.of(2019,9,6)));
		callLogList.add(new CallLog("+380971234567", LocalDate.of(2019, 9, 7)));
		callLogList.add(new CallLog("+380731234567", LocalDate.of(2019, 9, 7)));
		callLogList.add(new CallLog("+380673212323", LocalDate.now().minusDays(2)));
		callLogList.add(new CallLog("+380673212323", LocalDate.of(2019, 12, 21)));

		/**
		 * Create Message list
		 */

		List<Message> messageList = new ArrayList<>();
		messageList.add(new Message("Slava", "Hi"));
		messageList.add(new Message("Nastia", "Hi, how are you?"));
		messageList.add(new Message("Igor", "Call me"));
		messageList.add(new Message("Vasiliy", "Sorry, I'm late"));
		messageList.add(new Message("Egor", "Happy Birthday my dear friend"));

		Contact findInContactsValues = new Contact();
		findInContactsValues.findInContacts(contactList, "i");
		findInContactsValues.printerToCLI();

		Message findInMessageValues = new Message();
		findInMessageValues.findInMessages(messageList, "Hi");
		findInMessageValues.printMessageToCLI();


		/**
		 * 04 Task print on screen
		 */
		Map<Contact, List<CallLog>> group = new HashMap<>();

		group = CombiningContactCallLog(contactList, callLogList);

		for (Map.Entry<Contact, List<CallLog>> item: group.entrySet()) {
			System.out.println(item.getKey() + ":");
			List<CallLog> listLogs = item.getValue();
			for (CallLog logs : listLogs) {
				System.out.println(logs);
			}
		}
	/**
	* End 04 Task
	*/
//		List<Pair<Contact,Integer>> listOfTopFiveMessages = new ArrayList<>();
//		listOfTopFiveMessages = topFiveMasseges(test2);
//
//		for (Pair<Contact,Integer> item: listOfTopFiveMessages) {
//			System.out.println(item);
//		}


	//Main end
	}

	/**
	 * Task 4 Combine call for contact
	 */

	private static Map<Contact, List<CallLog>> CombiningContactCallLog
				(List<Contact> contactList, List<CallLog> callLogList){

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
	 * 05 Task
	 */
//	public static List<Pair<Contact,Integer>> topFiveCalls(Map<Contact, List<CallLog>> CombiningContactAndCallLog){
//		List<Pair<Contact, Integer>> middleResultTopFiveCalls= new ArrayList<>();
//		List<Pair<Contact, Integer>> resultTopFiveCalls= new ArrayList<>();
//
//		List<Integer> pairIntegers = new ArrayList<>();
//
//		for (Map.Entry<Contact, List<CallLog>> item: CombiningContactAndCallLog.entrySet()) {
//			List<CallLog>listLogs = item.getValue();
//			Integer numberOfCalls = listLogs.size();
//			pairIntegers.add(numberOfCalls);
//			Pair<Contact,Integer> pair = new Pair<>(item.getKey(),numberOfCalls);
//			middleResultTopFiveCalls.add(pair);
//		}
//
//		Collections.sort(middleResultTopFiveCalls, new Comparator<Pair<Contact, Integer>>() {
//			@Override
//			public int compare(Pair<Contact, Integer> o1, Pair<Contact, Integer> o2) {
//				return Integer.compare(o2.getValue(), o1.getValue());
//			}
//		});
//
//		for (int i = 0; i < 5; i++) {
//			resultTopFiveCalls.add(middleResultTopFiveCalls.get(i));
//		}
//
//		return resultTopFiveCalls;
//	}
	/**
	 * 05 End
	 */
}
