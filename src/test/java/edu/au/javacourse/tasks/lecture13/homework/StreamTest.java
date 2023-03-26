package edu.au.javacourse.tasks.lecture13.homework;
import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Stream;

public class StreamTest {
    StudentGroup st202 = new StudentGroup(2, "202", List.of(new Student[]{new Student("Mary", "Bloody"), new Student("Fred", "Miller")}));
    StudentGroup st206 = new StudentGroup(2, "206", List.of(new Student[]{new Student("Alice", "Bloody"), new Student("John", "Green")}));
    StudentGroup st101 = new StudentGroup(1, "101", List.of(new Student[]{new Student("Tom", "Cooper"), new Student("Andy", "Cherry")}));
    StudentGroup st303 = new StudentGroup(3, "303", List.of(new Student[]{new Student("Oleg", "Freeman"), new Student("Harry", "Grey")}));
    StudentGroup st416 = new StudentGroup(4, "416", List.of(new Student[]{new Student("Bob", "Ivanov"), new Student("Ivan", "Petrov")}));
    List<StudentGroup>  groups = new ArrayList<StudentGroup>();


    @Test
    void secondYear() throws NoSuchFieldException, IllegalAccessException {
        //StudentGroup.class.getDeclaredField("students").setAccessible(true);
        //Student.class.getDeclaredField("firstName").setAccessible(true);
        //Student.class.getDeclaredField("lastName").setAccessible(true);
        // Для приватного пока не получилось( Постараюсь исправить в течкение недели
        groups.add(st202);
        groups.add(st206);
        groups.add(st101);
        groups.add(st303);
        groups.add(st416);
        for (StudentGroup group: groups){
            System.out.println(group.getGroup());
        }
        String[][] testStudents = {{"Сергей", "Королев"}, {"Mary", "Bloody"}, {"Bob", "Ivanov"}};
        for (int i = 0; i < 3; i++) {
            int finalI = i;
            boolean f = groups.stream().filter(gr -> gr.year == 2).anyMatch(gr -> gr.students.stream().anyMatch(student -> Objects.equals(student.firstName, testStudents[finalI][0]) && Objects.equals(student.lastName, testStudents[finalI][1])));
            if (f)
                System.out.println("Студент " + testStudents[i][0] + " " + testStudents[i][1] + " учится на втором курсе");
            else
                System.out.println("Студент " + testStudents[i][0] + " " + testStudents[i][1] + " не учится на втором курсе");

        }
    }

    @Test
    void ReferenceTest() {
        groups.add(st202);
        groups.add(st206);
        groups.add(st101);
        groups.add(st303);
        groups.add(st416);
        String au =  "Санкт-Петербургский национальный исследовательский Академический университет имени Ж.И. Алфёрова РАН";
        groups.stream().flatMap(gr -> gr.students.stream()).sorted(Comparator.comparing((Student st )-> st.getYear(groups)).thenComparing( st -> st.lastName).thenComparing(st -> st.firstName)).forEach(st -> System.out.println(new Reference(au, st.getYear(groups), st).getReference()));
    }
}

