package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String s = r.readLine();
        int y = Integer.parseInt(r.readLine());
        int m = Integer.parseInt(r.readLine());
        int d = Integer.parseInt(r.readLine());

        System.out.println("Меня зовут " + s);
        System.out.println("Я родился " + d + "." + m + "." + y);
    }
}
