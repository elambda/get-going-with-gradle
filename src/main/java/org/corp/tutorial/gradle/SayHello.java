package org.corp.tutorial.gradle;

import java.time.LocalDate;

public class SayHello {

	public static void main(String[] args) {
		SayHello sayHello = new SayHello();
		System.out.println(sayHello.formatMessage("hello world! %s.", "Java"));
		System.out.println(sayHello.getCurrentDate());
	}

	public String formatMessage(String msg, Object... args) {
		return String.format(msg, args);
	}

	public LocalDate getCurrentDate() {
		return LocalDate.now();
	}

}
