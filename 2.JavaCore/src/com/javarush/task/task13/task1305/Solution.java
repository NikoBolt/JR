package com.javarush.task.task13.task1305;

/* 
4 ошибки
*/

public class Solution {

    public static void main(String[] args) throws Exception {

        System.out.println(new /*4 Dream() */ Hobbie().HOBBIE.toString());
        System.out.println(new Hobbie().toString());

    }

    interface Desire {
    }

    interface Dream {
        /*private*/ static Hobbie HOBBIE = new Hobbie();
    }

    /*3*/static/**/ class Hobbie /*1/ extends Desire */ implements Dream, /*2*/ Desire{
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
