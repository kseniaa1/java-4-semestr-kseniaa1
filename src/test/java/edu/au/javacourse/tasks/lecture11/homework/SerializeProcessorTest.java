package edu.au.javacourse.tasks.lecture11.homework;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class SerializeProcessorTest {
    @Test
    void test() throws IllegalAccessException {
        SerializeProcessor<Animal> processor1 = new SerializeProcessor<>(new Animal("cat", "brown", "long"));
        System.out.println(processor1.buildJsonString());
        SerializeProcessor<Animal> processor2 = new SerializeProcessor<>(new Animal("dog", "brown", "round"));
        System.out.println(processor2.buildJsonString());
        SerializeProcessor<Animal> processor3 = new SerializeProcessor<>(new Animal("snake", "green", "none"));
        System.out.println(processor3.buildJsonString());
        SerializeProcessor<Animal> processor4 = new SerializeProcessor<>(new Animal("unknown", "purple", "square", 7));
        System.out.println(processor4.buildJsonString());
        SerializeProcessor<NotAnimal> processor5 = new SerializeProcessor<>(new NotAnimal("chair", "red", "Bob"));
        System.out.println(processor5.buildJsonString());
    }
}
