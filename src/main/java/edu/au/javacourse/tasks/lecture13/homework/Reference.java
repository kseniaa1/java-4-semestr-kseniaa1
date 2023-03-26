package edu.au.javacourse.tasks.lecture13.homework;

public class Reference {
    String university;
    int year;
    Student student;
    Reference(String university,int year, Student student ) {
        this.university = university;
        this.year = year;
        this.student = student;
    }
    String getReference(){
        return "Справка дана в том, что "+student.lastName+" "+student.firstName+" является студентом "+year+" года обучения. Место обучения: "+university+ ".";
    }
}
