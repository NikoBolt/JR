package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(a.readLine());
        int minutesInt = (int) t;
        if (minutesInt%5 == 3)
            System.out.println("желтый");
        else if (minutesInt%5 == 4)
            System.out.println("красный");
        else System.out.println("зелёный");
    }
}