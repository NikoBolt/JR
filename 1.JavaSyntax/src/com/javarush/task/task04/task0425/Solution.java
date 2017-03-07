package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());

        int c=0;
        if ((a>0)&(b>0)) c= 1;
        if ((a<0)&(b>0)) c= 2;
        if ((a<0)&(b<0)) c= 3;
        if ((a>0)&(b<0)) c= 4;

        System.out.println(c);
    }
}
