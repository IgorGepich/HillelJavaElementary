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
}
