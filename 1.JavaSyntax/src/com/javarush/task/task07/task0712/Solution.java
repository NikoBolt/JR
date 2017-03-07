package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        int lengthMax = 0;
        int lengthMin = 2147483647;
        boolean result = false;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++)
        {
            list.add(reader.readLine());

            if(lengthMax < list.get(i).length())
                lengthMax = list.get(i).length();
            if(lengthMin > list.get(i).length())
                lengthMin = list.get(i).length();
        }
        for (int i = 0; i < 10; i++) {
            if (!result
                    & (list.get(i).length() == lengthMax
                    || list.get(i).length() == lengthMin))
            {
                System.out.println(list.get(i));
                result = true;
            }
        }
    }
}
