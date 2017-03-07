package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        int id = Integer.parseInt(reader.readLine());
//        String name = reader.readLine();
//
//        System.out.println("Id=" + id + " Name=" + name);

        //
        Map<String, Integer> map = new HashMap<String, Integer>();
        while (true)
        {
            String id = reader.readLine();
            if (id.equals("")) break;
            String name = reader.readLine();
            //if (name=="") break;
            int num = Integer.parseInt(id);
            map.put(name,num);
        }
        for (Map.Entry<String, Integer> pair : map.entrySet()){
            System.out.println(pair.getValue()+" "+pair.getKey());
        }
        //
    }
}
