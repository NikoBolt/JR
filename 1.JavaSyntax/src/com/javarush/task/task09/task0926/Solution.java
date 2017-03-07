package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {

        //напишите тут ваш код
        int[] list1 = new int[5];
        int[] list2 = new int[2];
        int[] list3 = new int[4];
        int[] list4 = new int[7];
        int[] list5 = new int[0];

        ArrayList<int[]> array = new ArrayList<int[]>();
        array.add(list1);
        array.add(list2);
        array.add(list3);
        array.add(list4);
        array.add(list5);

        for (int[] arr : array)
        {
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = (int) (Math.random() * 100*(i+1));
            }
        }

        return array;
        //
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
            //System.out.println(" ");
        }
    }
}
