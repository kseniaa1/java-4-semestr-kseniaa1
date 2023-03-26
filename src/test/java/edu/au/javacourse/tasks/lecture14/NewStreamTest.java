package edu.au.javacourse.tasks.lecture14;

import edu.au.javacourse.tasks.lecture12.classwork.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class NewStreamTest {
    @Test
    void factorial(){
        int res = Stream.iterate(1, i -> i+1).limit(5).reduce(1, (i, j) -> i*j);
        System.out.println(res);
    }
    @Test
    void tenGroup(){
    Map<Integer, List<Integer>> group = ThreadLocalRandom.current().ints(30,1, 99).boxed().collect(groupingBy(i -> i/10));
    System.out.println(group);
    }
    @Test
    void count(){
        List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        int amount = strings.stream().map(i -> 1).reduce(0, Integer::sum);
        System.out.println(amount);
    }
    @Test
    void persons() {
        List<Person> p = new ArrayList<>();
        p.add(new Person("John", 5));
        p.add(new Person("Alice", 5));
        p.add(new Person("Martin", 23));
        p.add(new Person("John", 18));
        Map<Integer, String> res = p.stream().collect(Collectors.groupingBy(Person::getAge,
                Collectors.mapping(Person::getName, Collectors.joining(", "))));
        System.out.println(res);
    }
}
