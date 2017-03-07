package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = -2147483648;// минимальное значение целого типа данных (integer) равняется
        // System.out.println(maximum-1);  2147483647
        // System.out.println(maximum+1); -2147483647
        // System.out.println(maximum-2);  2147483646


    //напишите тут ваш код
        int n = Integer.parseInt(reader.readLine());

        /*
        int[] list = new int[x];
        int maximum = list[0];
        for (int i = 0; i < list.length; i++)
        {
            list[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < list.length; i++)
        {
            if (maximum < list[i])
                maximum = list[i];
        }
         */

        if (n>0) {
            for (int i=0; i<n; i++){
                int a=Integer.parseInt(reader.readLine());
                maximum =max(maximum,a);
            }
            System.out.println(maximum);
        }
        else System.out.println("N<0");

//        System.out.println(maximum);
    }
    public static int max(int a, int b)    {
        return a > b ? a : b;
    }
}
