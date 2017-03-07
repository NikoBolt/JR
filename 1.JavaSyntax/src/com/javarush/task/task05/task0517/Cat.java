package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name;
    private int weight = 15;
    private int age = 2;
    private String color = "green";
    private String adress;

    public Cat(String name)
    {
        this.name = name;
    }
    public Cat(String name, int weight, int age)
    {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }
    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public Cat(int weight, String color)
    {
        this.weight = weight;
        this.color = color;
    }
    public Cat(int weight, String color, String adress)
    {
        this.weight = weight;
        this.color = color;
        this.adress = adress;
    }

    public static void main(String[] args) {

    }
}
