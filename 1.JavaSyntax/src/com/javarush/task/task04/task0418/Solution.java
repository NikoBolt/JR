package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        //int i=0;
        //while (i<4){
        //i++;
        String a,b;
        int cA,dB;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("введите a и b, ");
        a=r.readLine();
        b=r.readLine();
        cA = Integer.parseInt(a);
        dB = Integer.parseInt(b);
        if (cA > dB){
            //System.out.println("минимум = "+dB);
            System.out.println(dB);
        }
        else if (cA < dB) {
            //System.out.println("минимум = "+cA);
            System.out.println(cA);
        }
        else {
            //System.out.println("минимум = " +cA);
            System.out.println(cA);
        }
        //}
    }
}