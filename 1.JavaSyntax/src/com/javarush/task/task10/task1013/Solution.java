package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        public String name;
        public Integer age;
        public boolean sex;
        public Human father;
        public Human mother;
        public Human kids;

        public Human(){}
        public Human(String name){
            this.name=name;
        }
        public Human(String name,Integer age,boolean sex){
            this.name=name;
            this.age=age;
            this.sex=sex;
        }
        public Human(String name,boolean sex,Integer age){
            this.name=name;
            this.sex=sex;
            this.age=age;
        }
        public Human(String name,boolean sex,Integer age,Human father,Human mother){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
        }
        public Human(String name,Integer age,boolean sex,Human father,Human mother){
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.father=father;
            this.mother=mother;
        }
        public Human(String name,boolean sex,Human father,Human mother,Human kids){
            this.name=name;
            this.sex=sex;
            this.father=father;
            this.mother=mother;
            this.kids=kids;
        }
        public Human(String name,Integer age,Human father,Human mother,Human kids){
            this.name=name;
            this.age=age;
            this.father=father;
            this.mother=mother;
            this.kids=kids;
        }
        public Human(String name,boolean sex,Integer age,Human father,Human mother,Human kids){
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.father=father;
            this.mother=mother;
            this.kids=kids;
        }
        public Human(String name,Integer age,boolean sex,Human father,Human mother,Human kids){
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.father=father;
            this.mother=mother;
            this.kids=kids;
        }
    }
}
