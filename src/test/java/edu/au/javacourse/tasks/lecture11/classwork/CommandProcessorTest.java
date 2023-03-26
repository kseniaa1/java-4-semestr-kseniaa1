package edu.au.javacourse.tasks.lecture11.classwork;

import org.junit.jupiter.api.Test;
import java.lang.reflect.InvocationTargetException;

public class CommandProcessorTest {
    @Test
    void test() throws InvocationTargetException, IllegalAccessException {
        CommandProcessor processor = new CommandProcessor(new Controller());

        processor.execute("add");
        processor.execute("list");
        processor.execute("add");
        processor.execute("sort");
        processor.execute("clear");

    }
}
