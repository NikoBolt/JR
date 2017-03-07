package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        //дети. У детей нет детей.
        Human child1 = new Human("Ребенок 1",true,3,null);
        Human child2 = new Human("Ребенок 2",false,5,null);
        Human child3 = new Human("Ребенок 3",true,7,null);

        ArrayList<Human> childs= new ArrayList<Human>();
        childs.add(child1);
        childs.add(child2);
        childs.add(child3);

        //папа мама и их список для добавления дедушкам - бабушкам
        Human fathe = new Human("Папа",true,20,childs);
        Human mathe = new Human("Мама",false,18,childs);

        ArrayList<Human> parents1= new ArrayList<Human>();
        parents1.add(fathe);
        ArrayList<Human> parents2= new ArrayList<Human>();
        parents2.add(mathe);

        //дедушки бабушки
        Human grFat1 = new Human("Папа папы",true,45,parents1);
        Human grFat2 = new Human("Папа мамы",true,50,parents1);
        Human grMa1 = new Human("Мама папы",false,40,parents2);
        Human grMa2 = new Human("Мама мамы",false,47,parents2);

        System.out.println(grFat1);
        System.out.println(grFat2);
        System.out.println(grMa1);
        System.out.println(grMa2);
        System.out.println(fathe);
        System.out.println(mathe);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children=new ArrayList<Human>();

        Human(String name,boolean sex,int age,ArrayList<Human> children){
            this.name=name;
            this.sex=sex;
            this.age=age;
            if (children==null){
                this.children=new ArrayList<Human>();
            }
            else this.children = children;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            } // else text+= ", детей нет";
            return text;
        }
    }

}
