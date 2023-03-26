package edu.au.javacourse.tasks.lecture00.homework;

public class HomeWorkHello {

	private final String name;

	public HomeWorkHello(String name) {
		this.name = name;
	}

	public void sayHello() {
		System.out.println("Hello from home, %s!".formatted(name));
	}
}
