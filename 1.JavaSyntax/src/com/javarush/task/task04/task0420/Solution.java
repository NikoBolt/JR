package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(r.readLine());
        int b = Integer.parseInt(r.readLine());
        int c = Integer.parseInt(r.readLine());

        int x, y, z;
        if (a>b) {
            if (a>c)
            {
                x = a;
                if (c > b)
                {
                    y = c;
                    z = b;
                } else
                {
                    y = b;
                    z = c;
                }
            }else
            {
                x=c; y=a;z=b;
            }
        }else
        {
            if (b > c)
            {
                x = b;
                if (c > a)
                {
                    y = c;
                    z = a;
                } else
                {
                    y = a;
                    z = c;
                }
            } else
            {
                x = c;
                y = b;
                z = a;
            }
        }
        System.out.println(x + " " + y + " " + z);
    }
}
