package com.javarush.task.task05.task0516;

/* 
Друзей не купишь
*/

public class Friend {
    //напишите тут ваш код
    private String name;
    private int age;
    private String gender;

    public Friend(String name)
    {
        this.name = name;
    }
    public Friend(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public Friend(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {

    }
}
