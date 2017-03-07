package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        String d = r.readLine();
        int a = Integer.parseInt(d);
        if (a>20) System.out.print("И 18-ти достаточно");
    }
}
