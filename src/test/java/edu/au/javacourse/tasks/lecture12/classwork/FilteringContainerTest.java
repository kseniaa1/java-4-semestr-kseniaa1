package edu.au.javacourse.tasks.lecture12.classwork;

import org.junit.jupiter.api.Test;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilteringContainerTest {
   @Test
    void test1() {
       Consumer<Person> rejecter = value -> {
           System.out.println(value.name + " is too young: " + value.age);
       };
       Predicate<Person> filter = item -> item.age >= 18;
       FilteringContainer<Person> testContainer = new FilteringContainer<>(filter, rejecter);
       testContainer.add(new Person("Alice", 21));
       testContainer.add(new Person("Bob", 8));
       testContainer.add(new Person("John", 18));
      for (Person person : testContainer.getItems()) {
          System.out.println(person.name + " " + person.age);
      }
   }
}
