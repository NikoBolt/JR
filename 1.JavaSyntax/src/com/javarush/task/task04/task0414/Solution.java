package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.print("Введите год: ");

        String numer = reader.readLine();
        int year = Integer.parseInt(numer);

        int x1 = 365;
        int x2 = 366;

        if ((year % 4 ==0) && (year% 100!=0))
            System.out.println("количество дней в году: "+ x2);
        else if ((year%4==0) && (year%400==0))
            System.out.println("количество дней в году: "+ x2);
        else
            System.out.println("количество дней в году: " + x1);
    }
}