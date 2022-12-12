package org.corp.tutorial.gradle;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SayHelloTest {

	@Test
	protected void testSayHello() {
		Assertions.assertNotNull(new SayHello().showMessage());
	}

	@Test
	protected void testSayHelloX() {
		Assertions.assertNotNull(new SayHello().getTimeNow());
	}

}