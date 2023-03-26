package edu.au.javacourse.tasks.lecture12.homework;

import edu.au.javacourse.tasks.lecture12.classwork.FilteringContainer;
import edu.au.javacourse.tasks.lecture12.classwork.Person;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FilteringContainerTest2 {
    @Test
    void test2() {
        ArrayList<String> rej = new ArrayList<String>();
        Consumer<String> rejecter = rej::add;
        Predicate<String> filter = item -> item.length() <= 6;
        FilteringContainer<String> testContainer = new FilteringContainer<>(filter, rejecter);
        testContainer.add("java");
        testContainer.add("is very cool");
        testContainer.add("aaa");
        testContainer.add("aaaaaaaaa");
        testContainer.add("baa");
        ArrayList<String> acc = new ArrayList<String>(testContainer.getItems());
        acc.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
        rej.sort(Comparator.comparing(String::length).thenComparing(String::compareTo));
        System.out.println("Strings in container:");
        for (String str: acc) {
            System.out.println(str);
        }
        System.out.println("Too long strings:");
        for (String str: rej) {
            System.out.println(str);
        }
    }
}
