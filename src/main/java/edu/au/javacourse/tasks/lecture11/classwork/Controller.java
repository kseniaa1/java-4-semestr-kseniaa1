package edu.au.javacourse.tasks.lecture11.classwork;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller {

    private final List<Integer> numbers;

    public Controller() {
        numbers = new ArrayList<>();
    }

    @Command("list")
    public void listAllNumbers() {
        System.out.println("Numbers: " + numbers);
    }

    @Command("add")
    public void addNewNumber() {
        int newInt = new Random().nextInt(100);
        numbers.add(newInt);
        System.out.println("New number added: " + newInt);
    }

    @Command("clear")
    public void deleteAllNumbers(){
        numbers.clear();
        System.out.println("All numbers have been deleted");
    }
}
