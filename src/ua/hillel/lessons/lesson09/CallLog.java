package ua.hillel.lessons.lesson09;

import java.time.LocalDate;
import java.util.Objects;


public class CallLog {
	private String phoneNumber;
	private LocalDate localDate;

	String getPhoneNumber() {
		return phoneNumber;
	}

	private LocalDate getLocalDate() {
		return localDate;
	}

	public CallLog(String phoneNumber, LocalDate localDate) {
		this.phoneNumber = phoneNumber;
		this.localDate = localDate;

	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof CallLog)) return false;
		CallLog callLog = (CallLog) o;
		return getPhoneNumber().equals(callLog.getPhoneNumber()) &&
				getLocalDate().equals(callLog.getLocalDate());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getPhoneNumber(), getLocalDate());
	}

//	SimpleDateFormat callLogDate = new SimpleDateFormat("EEEE, MMMM d, yyyy");
	public String dateFormat(){
	LocalDate localDate1 = LocalDate.of(2019, 06, 13);
	return localDate1.toString();
	}



	/**
	 * Find method
	 */
//	public Collection<CallLog> find(Collection<CallLog> callLogList, String fieldToFind) {
//		List<CallLog> findCallLogValues = new ArrayList<CallLog>();
//		for (CallLog foundFild : callLogList) {
//			if(foundFild.getPhoneNumber().contains(fieldToFind)
//					|| foundFild.getLocalDate().contains()){
//				findCallLogValues.add(foundFild);
//			}
//		}
//		return findCallLogValues;
//	}
}
