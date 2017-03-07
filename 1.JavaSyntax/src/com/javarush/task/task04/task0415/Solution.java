package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //System.out.print("Введите длинну стороны а: ");
        String numer = reader.readLine();
        int a = Integer.parseInt(numer);

        //System.out.print("Введите длинну стороны b: ");
        numer = reader.readLine();
        int b = Integer.parseInt(numer);

        //System.out.print("Введите длинну стороны c: ");
        numer = reader.readLine();
        int c = Integer.parseInt(numer);

        if (( a < (b+c)) && ( b < (a+c)) && ( c < (a+b)))
            System.out.println("Треугольник существует.");
        else System.out.println("Треугольник не существует.");
    }
}