package edu.au.javacourse.tasks.lecture11.homework;
import java.lang.reflect.Field;

public class SerializeProcessor<T> {
    T clazz;
    private int counter = 0;

    public SerializeProcessor(T clazz) {
        this.clazz = clazz;
    }

    public String buildJsonString() throws IllegalAccessException {
        String[][] jsonArray = new String[100][2];
        Field[] fields = clazz.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Serialize.class)) {
                jsonArray[counter][0] = field.getName();
                jsonArray[counter][1] = (String) field.get(clazz);
                counter++;
            }
        }
        StringBuilder result = new StringBuilder("{");
        for (int i = 0; i < counter; i++) {
            result.append("\"").append(jsonArray[i][0]).append("\": \"").append(jsonArray[i][1]).append("\"");
            if (i != counter - 1) result.append(", ");
        }
        result.append("}");
        return result.toString();
    }
}
