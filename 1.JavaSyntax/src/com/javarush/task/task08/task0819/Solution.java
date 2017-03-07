package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        //System.out.println(" dfgfdgfdgfdg"+cats);
        Iterator<Cat> i = cats.iterator();
        i.next();
        i.remove();


        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cats = new HashSet<Cat>();
        for (int i=0; i<3; i++){
            cats.add(new Cat());
        }

//        return null;
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Object cat : cats)
            System.out.println(cat);
    }

    // step 1 - пункт 1
    public static class Cat {
    }
}
