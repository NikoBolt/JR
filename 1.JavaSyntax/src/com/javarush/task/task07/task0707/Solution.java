package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        list.add(0, "Маша");
        list.add(1, "Лена");
        list.add(2, "Даша");
        list.add(3, "Света");
        list.add(4, "Катя");
        System.out.println(list.size());
        for (int i =0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
