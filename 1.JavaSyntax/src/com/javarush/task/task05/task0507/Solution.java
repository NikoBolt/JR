package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int count = 0;
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int a = Integer.parseInt(reader.readLine());
            if (a==-1) break;
            count++;
            sum = sum + a;
        }
        double result = (double) sum/count;
        System.out.println(result);
    }
}

