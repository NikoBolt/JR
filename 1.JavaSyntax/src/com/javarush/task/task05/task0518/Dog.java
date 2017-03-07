package com.javarush.task.task05.task0518;

/* 
Регистрируем собачек
*/


public class Dog {
    //напишите тут ваш код
    private String name;
    private int age;
    private String gender;

    public Dog(String name)
    {
        this.name = name;
    }
    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public Dog(String name, int age, String gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {

    }
}
