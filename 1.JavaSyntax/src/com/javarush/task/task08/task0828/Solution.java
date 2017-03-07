package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Jan",1);
        map.put("Feb",2);
        map.put("Mar",3);
        map.put("Apr",4);
        map.put("May",5);
        map.put("Jun",6);
        map.put("Jul",7);
        map.put("Aug",8);
        map.put("Sep",9);
        map.put("Oct",10);
        map.put("Nov",11);
        map.put("Dec",12);

        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();
        month = month.toUpperCase().substring(0,1)+month.substring(1);
        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            if (month.contains(pair.getKey()) )
            {
                System.out.println(month + " is " + pair.getValue() + " month");
                break;
            }
        }
    }
}
