package edu.au.javacourse.tasks.lecture13.homework;
import java.util.List;

public class StudentGroup {
    int year;
    String number;
    List<Student> students;
    StudentGroup(int year, String number, List<Student> students) {
        this.year = year;
        this.number = number;
        this.students = students;
    }
    String getGroup() throws NoSuchFieldException, IllegalAccessException {
       Student.class.getDeclaredField("firstName").setAccessible(true);
       Student.class.getDeclaredField("lastName").setAccessible(true);
       String group = "";
        for (Student student : students) {
            group += "Год обучения: " + year + ", номер группы: " + number + " Студент: " + Student.class.getDeclaredField("firstName").get(student)+ " " + Student.class.getDeclaredField("lastName").get(student)+'\n';
        }
        return group;
    }
}
