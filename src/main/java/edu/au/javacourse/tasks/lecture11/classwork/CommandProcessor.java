package edu.au.javacourse.tasks.lecture11.classwork;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CommandProcessor {
    private final Controller controller;
    private final Map<String, Method> commandHandlers;

    public CommandProcessor(Controller controller) {
        this.controller = controller;
        this.commandHandlers = buildCommandHandlersMap();
    }

    private Map<String, Method> buildCommandHandlersMap() {
        Map<String, Method> handlersMap = new HashMap<>();
        Class<? extends Controller> clazz = controller.getClass();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Command.class)) {
                Command commandAnnotation = method.getAnnotation(Command.class);
                String commandName = commandAnnotation.value();
                handlersMap.put(commandName, method);
            }
        }
        return handlersMap;
    }

    public void execute(String command) throws InvocationTargetException, IllegalAccessException{
        Method handler = commandHandlers.get(command);

        if (handler == null) {
            System.out.println("ОШИБКА: Неизвестная команда %s".formatted(command));
        } else {
            handler.invoke(controller);
        }
    }
}
