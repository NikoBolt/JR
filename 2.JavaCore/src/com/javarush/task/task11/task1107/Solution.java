package com.javarush.task.task11.task1107;

/* 
Доступ есть
*/

public class Solution {
    public static void main(String[] args) {
    }

    public class Cat {
        /*public*/ private String name;
        /*public*/ private  int age;
        public int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}