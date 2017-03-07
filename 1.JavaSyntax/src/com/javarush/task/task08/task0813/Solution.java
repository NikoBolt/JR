package com.javarush.task.task08.task0813;

import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static HashSet<String> createSet() {
        //напишите тут ваш код
        HashSet<String >  set = new HashSet<String>();
        for(char i = 'А';i<'Ф';i++)set.add("Л"+i);
        return (HashSet<String>)set;
    }

    public static void main(String[] args) {

    }
}
