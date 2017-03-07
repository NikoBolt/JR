package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String a=r.readLine();
        String b=r.readLine();
        String c=r.readLine();
        String d=r.readLine();
        int cA = Integer.parseInt(a);
        int cB = Integer.parseInt(b);
        int cC = Integer.parseInt(c);
        int cD = Integer.parseInt(d);

        System.out.print(max(max(cA,cB),max(cC,cD)));
    }

    public static int max(int x, int y)
    {
        if ( x > y) return x;
        else return y;
    }
}
