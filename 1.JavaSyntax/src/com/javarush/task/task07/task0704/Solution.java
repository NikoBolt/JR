package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] array = new int[10];
        int[] yarra = new int[10];
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
            array[i] = Integer.parseInt(r.readLine());
        }
        for (int i = 0; i < 10; i++)
        {
            yarra[i] = array[9-i];
            System.out.println(yarra[i]);
        }
    }
}

