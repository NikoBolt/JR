package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String a = r.readLine();
        String b = r.readLine();

        if (a.equals(b) == true ) System.out.println("Имена идентичны");
        else if (a.length() == b.length()) System.out.println("Длины имен равны");

//        else {
//            char gt[] = s.toCharArray();
//            char tg[] = d.toCharArray();
//            if (gt.length==tg.length)
//                System.out.println("Длины имен равны");
//        }
    }
}
