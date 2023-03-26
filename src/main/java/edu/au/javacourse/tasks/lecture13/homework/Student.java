package edu.au.javacourse.tasks.lecture13.homework;

import java.util.List;
import java.util.Objects;

public class Student {
    String firstName;
    String lastName;
    Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    int getYear(List<StudentGroup> groups) {
        for (StudentGroup gr: groups){
            if (gr.students.stream().anyMatch(st -> (Objects.equals(st.firstName, this.firstName))&&(Objects.equals(st.lastName, this.lastName)))) return gr.year;
        }
        return 0;
    }
}
