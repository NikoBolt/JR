package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Dima", 50, "Medved street");
        Man man2 = new Man("Vova", 55, "Volk street");
        Woman woman1 = new Woman("Masha", 25, "Fox street");
        Woman woman2 = new Woman("Natasha", 20, "Butterfly square ");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }

    //напишите тут ваш код
    public static class Man{
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            return this.name+" "+this.age+" "+ this.address;
        }
    }

    public static class Woman{
        private String name;
        private int age;
        private String address;

        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            return this.name+" "+this.age+" "+ this.address;
        }
    }
}
