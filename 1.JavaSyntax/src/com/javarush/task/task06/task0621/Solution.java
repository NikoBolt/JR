package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String motherName = reader.readLine();
//        Cat catMother = new Cat(motherName);
//
//        String daughterName = reader.readLine();
//        Cat catDaughter = new Cat(daughterName, catMother);
//
//        System.out.println(catMother);
//        System.out.println(catDaughter);

        String grandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(grandFatherName);

        String grandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(grandMotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName,catGrandFather,null);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName,null,catGrandMother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName,catFather, catMother);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName,catFather, catMother);


        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
//        private String name;
//        private Cat parent;
        private String name;
        private Cat parentFather;
        private Cat parentMother;

        Cat(String name) {
            this.name = name;
        }

//        Cat(String name, Cat parent) {
//            this.name = name;
//            this.parent = parent;
//        }

        Cat(String name, Cat parentFather, Cat   parentMother)
        {
            this.name = name;
            this.parentFather = parentFather;
            this.parentMother = parentMother;
        }

//        @Override
//        public String toString() {
//            if (parent == null)
//                return "Cat name is " + name + ", no mother ";
//            else
//                return "Cat name is " + name + ", mother is " + parent.name;
//        }

        @Override
        public String toString()
        {
            if (parentFather == null)
                if (parentMother == null)
                    return "Cat name is " + name + ", no mother, no father";
                else
                    return "Cat name is " + name + ", mother is " + parentMother.name + ", no father";
            else if (parentMother == null)
                return "Cat name is " + name + ", no mother, father is "+ parentFather.name;
            else
                return "Cat name is " + name + ", mother is " + parentMother.name + ", father is "+ parentFather.name;
        }
    }

}
