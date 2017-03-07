package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //напишите тут ваш код
        Cat tom = new Cat("Tom","Black", 7);
        Dog hank = new Dog("Hank", 10 , 50);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //напишите тут ваш код
    public static class Dog{
        int age;
        String name;
        int height;
        public Dog(String name, int age, int height){
            this.age = age;
            this.name = name;
            this.height = height;
        }
    }

    public  static class Cat{
        int age;
        String name;
        String color;
        public Cat(String name,String color, int age){
            this.age = age;
            this.name = name;
            this.color = color;
        }
    }
}
