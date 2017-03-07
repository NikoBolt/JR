package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int sum = 0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int a = Integer.parseInt(r.readLine());

            sum= sum+a;

            if (a==-1) break;
        }
        System.out.println(sum);
    }
}
