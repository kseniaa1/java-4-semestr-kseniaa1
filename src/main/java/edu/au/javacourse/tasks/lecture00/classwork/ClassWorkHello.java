package edu.au.javacourse.tasks.lecture00.classwork;

public class ClassWorkHello {

	private final String name;

	public ClassWorkHello(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hello from class, %s!".formatted(name));
	}
}
