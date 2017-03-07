package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(r.readLine());

        if ((a>0)&(a<10)&(a%2==0)) System.out.println("четное однозначное число");
        if ((a>0)&(a<10)&(a%2!=0)) System.out.println("нечетное однозначное число");
        if ((a>9)&(a<100)&(a%2==0)) System.out.println("четное двузначное число");
        if ((a>9)&(a<100)&(a%2!=0)) System.out.println("нечетное двузначное число");
        if ((a>99)&(a<1000)&(a%2==0)) System.out.println("четное трехзначное число");
        if ((a>99)&(a<1000)&(a%2!=0)) System.out.println("нечетное трехзначное число");
    }
}
