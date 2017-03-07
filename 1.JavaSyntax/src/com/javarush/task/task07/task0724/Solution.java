package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandFather1 = new Human("Ded1", true, 80, null, null);
        Human grandFather2 = new Human("Ded2", true, 80, null, null);
        Human grandMother1 = new Human("Baba", false, 70, null, null);
        Human grandMother2 = new Human("Baba2", false, 70, null, null);
        Human father = new Human("Papa", true, 45, grandFather1, grandMother1);
        Human mother = new Human("Mama", false, 35, grandFather2, grandMother2);
        Human child1 = new Human("Detka1", false, 20, father, mother);
        Human child2 = new Human("Detka2", true, 18, father, mother);
        Human child3 = new Human("Detka2", false, 10, father, mother);

        System.out.println(grandFather1);
        System.out.println(grandMother1);
        System.out.println(grandFather2);
        System.out.println(grandMother2);
        System.out.println(father.toString());
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        //напишите тут ваш код
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















