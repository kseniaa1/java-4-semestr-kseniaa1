package edu.au.javacourse.tasks.lecture13.classwork;

import org.junit.jupiter.api.Test;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest {
    @Test
    void randomInts() {
        ThreadLocalRandom.current().ints(10,1, 10).distinct().filter(x -> x%2==0).forEach(System.out::println);
    }
    @Test
    void Fibonacci(){
        Stream.iterate(new int[]{1, 1}, n -> new int[]{n[1], n[0] + n[1]}).map(x ->x[0]).limit(10).forEach(System.out::println);
    }
}
