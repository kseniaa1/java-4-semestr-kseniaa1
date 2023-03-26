package edu.au.javacourse.tasks.lecture00.homework;

import org.junit.jupiter.api.Test;

public class HomeWorkHelloTest {

	@Test
	void sayHelloTest() {
		HomeWorkHello helloer = new HomeWorkHello("Elena");
		helloer.sayHello();
	}
	
}
