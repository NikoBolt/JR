package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> result = new ArrayList<String>();

        int index=0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i=0; i<5; i++)
        {
            list.add(reader.readLine());

            if(list.get(index).length() > list.get(i).length())
                index = i;
        }

        for (int i=0;i<list.size(); i++)
        {
            if (list.get(index).length() == list.get(i).length())
            {
                result.add(list.get(i));
            }
        }

        for (int i=0; i<result.size();i++){
            System.out.println(result.get(i));
        }
    }
}
