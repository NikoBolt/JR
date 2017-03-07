package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String name=reader.readLine();

        String nume=reader.readLine();
        int num=Integer.parseInt(nume);
        String nume2=reader.readLine();
        int num2=Integer.parseInt(nume2);

        System.out.print(name+" получает "+num+" через "+num2+" лет.");
    }
}
