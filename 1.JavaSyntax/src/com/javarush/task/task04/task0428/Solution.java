package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int x=0;
        int a = Integer.parseInt(r.readLine());
        if (a>0) x++;
        a = Integer.parseInt(r.readLine());
        if (a>0) x++;
        a = Integer.parseInt(r.readLine());
        if (a>0) x++;

        System.out.println(x);
    }
}
