package com.javarush.task.task04.task0432;



/* 
Хорошего много не бывает
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String s = r.readLine();
        int a = Integer.parseInt(r.readLine());

        while (a>0) {
            System.out.println(s);
            a--;
        }
    }
}
