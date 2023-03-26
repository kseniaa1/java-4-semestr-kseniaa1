package edu.au.javacourse.tasks.lecture11.homework;

public class NotAnimal {
    @Serialize
    private String type;
    private String color;
    @Serialize
    private String owner;
    public NotAnimal(String type, String color, String owner){
        this.type = type;
        this.color = color;
        this.owner = owner;
    }
}
