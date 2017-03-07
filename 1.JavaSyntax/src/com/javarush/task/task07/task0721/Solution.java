package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        int maximum;
//        int minimum;
        int  maximum = 0;
        int  minimum = 0;

        //напишите тут ваш код
        ArrayList<Integer> num = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++)
        {
            num.add(Integer.parseInt(reader.readLine()));
            if (i == 0) {maximum = num.get(0); minimum = num.get(0);}

            if (num.get(i) > maximum) maximum = num.get(i);
            if (num.get(i) < minimum) minimum = num.get(i);
        }

        System.out.println(maximum);
        System.out.println(minimum);
    }
}
