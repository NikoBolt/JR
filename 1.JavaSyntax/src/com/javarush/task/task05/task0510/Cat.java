package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    private String name ;
    private int weight = 15;
    private int age = 2;
    private String color = "green";;
    private String adress;

    public void initialize(String name)
    {
        this.name = name;
    }
    public void initialize(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public void initialize(String nam, int age)
    {
        this.name = nam;
        this.age = age;
    }
    public void initialize(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
    }
    public void initialize(int weight, String color, String adress)
    {
        this.weight = weight;
        this.color = color;
        this.adress = adress;
    }

    public static void main(String[] args) {

    }
}
