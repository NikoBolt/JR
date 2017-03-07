package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    //напишите тут ваш код
    private String name;
    private int age;
    private String gen;

    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void initialize(String name, int age, String gen)
    {
        this.name = name;
        this.age = age;
        this.gen = gen;
    }

    public static void main(String[] args) {

    }
}
