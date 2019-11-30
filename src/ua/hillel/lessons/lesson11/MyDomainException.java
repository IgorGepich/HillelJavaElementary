package ua.hillel.lessons.lesson11;

class MyDomainException extends Exception {

	MyDomainException() {
	}

	MyDomainException(String string) {
		super(string);
	}

	MyDomainException(String string, Throwable cause) {
		super(string, cause);
	}
}
