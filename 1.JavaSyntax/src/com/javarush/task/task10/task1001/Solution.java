package com.javarush.task.task10.task1001;

/* 
Задача №1 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0;
        int b = /*(byte)*/ (int) a + 46;
        byte c = (byte) (a * b);
        double f = /*(char)*/ (double) 1234.15;
        long d = /*(short)*/ (long) (a + f / c + b);
        System.out.println(d);
    }
}
