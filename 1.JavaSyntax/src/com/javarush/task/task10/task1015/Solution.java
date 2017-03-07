package com.javarush.task.task10.task1015;

import java.util.ArrayList;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[3];
        for (int i = 0; i < 3; i++)
        {
            list[i]=new ArrayList<>(5);
            for (int j = 0; j < 5; j++)
            {
                list[i].add(i + "-й массив " + j + "-я строка");
            }
            //System.out.println(list[i].toArray());
        }

//        return null;
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}