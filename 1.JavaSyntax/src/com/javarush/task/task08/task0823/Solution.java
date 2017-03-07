package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //напишите тут ваш код
        char[] character = s.toCharArray();
        s = "";
        s += Character.toUpperCase(character[0]);
        for (int i = 1; i < character.length; i++)
        {
            if (Character.isSpaceChar(character[i - 1]) && !Character.isSpaceChar(character[i]))
            {
                s += Character.toUpperCase(character[i]);
            } else
                s += character[i];
        }
        System.out.println(s);
    }
}
