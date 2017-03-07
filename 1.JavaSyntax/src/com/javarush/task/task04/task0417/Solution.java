package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.print("Введите первое число: ");
        String numer = reader.readLine();
        int a = Integer.parseInt(numer);

        //System.out.print("Введите второе число: ");
        numer = reader.readLine();
        int b = Integer.parseInt(numer);

        //System.out.print("Введите третье число: ");
        numer = reader.readLine();
        int c = Integer.parseInt(numer);

        if ((a==b) && (b==c)) System.out.print(a + " " + b + " " + c);
        else if (a==b) System.out.print(a + " " + b);
        else if (b==c) System.out.print(b + " " + c);
        else if (a==c) System.out.print(a + " " + c);
    }
}