package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        System.out.print("Я буду зарабатывать $" + num + " в час");
    }
}
