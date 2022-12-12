package org.corp.tutorial.gradle;

import java.time.LocalDate;

public class SayHello {

	public static void main(String[] args){
		SayHello sayHello = new SayHello();
		sayHello.showMessage();
		sayHello.getTimeNow();
	}

	public String showMessage() {
		String format = "hello world! %s hello";
		System.out.printf(format, LocalDate.now());
		return format;
	}

	public LocalDate getTimeNow() {
		System.out.printf( "hello world! %s", LocalDate.now());
		return LocalDate.now();
	}

}
