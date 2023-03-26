package edu.au.javacourse.tasks.lecture00.classwork;

import org.junit.jupiter.api.Test;

public class ClassWorkHelloTest {

	@Test
	void sayHelloTest() {
		ClassWorkHello helloer = new ClassWorkHello("Elena");
		helloer.sayHello();
	}

}
