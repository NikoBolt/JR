package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int x=0;
        int y=0;
        int a = Integer.parseInt(r.readLine());
        if (a>0) x++; else if (a<0) y++;
        a = Integer.parseInt(r.readLine());
        if (a>0) x++; else if (a<0) y++;
        a = Integer.parseInt(r.readLine());
        if (a>0) x++; else if (a<0) y++;

        System.out.println("количество отрицательных чисел: " + y);
        System.out.println("количество положительных чисел: " + x);
    }
}
