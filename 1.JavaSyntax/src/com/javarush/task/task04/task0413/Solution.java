package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //System.out.print("Введите номер дня недели: ");
        String numer = reader.readLine();
        int num = Integer.parseInt(numer);

        String day;
        switch (num)
        {
            case 1:
                day = "понедельник";
                break;
            case 2:
                day = "вторник";
                break;
            case 3:
                day = "среда";
                break;
            case 4:
                day = "четверг";
                break;
            case 5:
                day = "пятница";
                break;
            case 6:
                day = "суббота";
                break;
            case 7:
                day = "воскресенье";
                break;
            default:
                day = "такого дня недели не существует";
                break;
        }
        System.out.print(day);
    }
}