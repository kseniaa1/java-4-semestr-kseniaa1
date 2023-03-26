package edu.au.javacourse.tasks.lecture11.homework;

public class Animal {
    @Serialize
    private String color;
    @Serialize
    public String type;
    @Serialize
    private String tail;
    private int legs;

    public Animal(String type, String color, String tail) {
       this.color = color;
       this.tail = tail;
       this.type = type;
    }
    public Animal(String type, String color, String tail, int legs) {
        this.color = color;
        this.tail = tail;
        this.type = type;
        this.legs = legs;
    }

    // getters
    // setters
}
