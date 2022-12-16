package org.corp.tutorial.gradle;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class SayHelloTest {

	private final SayHello sayHello;

	public SayHelloTest() {
		sayHello = new SayHello();
	}

	@Test
	protected void givenRawMsgAndFormat_thenGetCorrectFormattedMsg() {
		assertEquals(sayHello.formatMessage("hello %s", "Java"), "hello Java");
	}

	@Test
	protected void calculateCurrentDate() {
		assertEquals(sayHello.getCurrentDate(), LocalDate.now());
	}


	@Test
	@DisplayName("say hello to world")
	@Disabled
	protected void sayHelloToWorld() {
		fail("Not Implementation!");
	}


}