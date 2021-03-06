package com.javarush.task.task11.task1109;

/* 
Инкапсуляция для классов Cat и Dog
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 5);
        Dog dog = new Dog("Sharik", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }

    public static class Cat {
        /*public*/ private String name;
        /*public*/ private int speed;

        public Cat(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        /*public*/ private String getName() {
            return name;
        }

        /*public*/ private int getSpeed() {
            return speed;
        }

        public boolean isDogNear(Dog dog) {
            return this.speed > dog.getSpeed();
        }
    }

    public static class Dog {
        /*public*/ private String name;
        /*public*/ private int speed;

        public Dog(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        /*public*/ private String getName() {
            return name;
        }

        /*public*/ private int getSpeed() {
            return speed;
        }

        public boolean isCatNear(Cat cat) {
            return this.speed > cat.getSpeed();
        }
    }
}



