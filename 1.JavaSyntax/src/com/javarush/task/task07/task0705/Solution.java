package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array = new int[20];
        int[] ar = new int[10];
        int[] ray = new int[10];
        BufferedReader rec = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(rec.readLine());
            if (i < 10) ar[i]=array[i];
            else {ray[i - 10]=array[i];
                System.out.println(ray[i - 10]);
            }
        }
    }
}
