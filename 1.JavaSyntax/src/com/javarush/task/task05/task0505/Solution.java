package com.javarush.task.task05.task0505;

/* 
Кошачья бойня
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat("Барсик",4,34,6);
        Cat cat2 = new Cat("Мурка",3,40,4);
        Cat cat3 = new Cat("Тай-Лунг",7,31,3);

        if (cat1.fight(cat2) )
            System.out.println("победил " + cat1.name);
        else System.out.println("победил " + cat2.name);
        if (cat3.fight(cat2) )
            System.out.println("победил " + cat3.name);
        else System.out.println("победил " + cat2.name);
        if (cat1.fight(cat3) )
            System.out.println("победил " + cat1.name);
        else System.out.println("победил " + cat3.name);
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int agePlus = this.age > anotherCat.age ? 1 : 0;
            int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
            int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;

            int score = agePlus + weightPlus + strengthPlus;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
