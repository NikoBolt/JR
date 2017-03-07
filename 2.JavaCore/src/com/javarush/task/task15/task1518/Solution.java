package com.javarush.task.task15.task1518;

/* 
Статики 3
*/

public class Solution {
//    public static Cat cat;
    public static Object cat;

    static
    {
        class Cat
        {
            String name = "Пушок";
        }

        Cat myCat = new Cat();
        cat = myCat;
        System.out.println(myCat.name);
    }

    public static void main(String[] args) {

    }
}
