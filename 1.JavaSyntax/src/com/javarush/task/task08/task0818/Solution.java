package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Griffin", 100);
        map.put("Dior", 200);
        map.put("Dwayn", 500);
        map.put("Sarkisyan", 700);
        map.put("Jackson", 400);
        map.put("Dimond", 500);
        map.put("Putin", 300);
        map.put("Poroshenko", 600);
        map.put("Girinivskii", 200);
        map.put("Balbesovi4", 800);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        ArrayList<String> keys = new ArrayList<String>();
        for(HashMap.Entry<String, Integer> pair : map.entrySet()) {
            if (pair.getValue() < 500)
                keys.add(pair.getKey());
        }
        for (int i = 0; i < keys.size(); i++) {
            System.out.println(keys.get(i));
            map.remove(keys.get(i));
        }
    }

    public static void main(String[] args) {

    }
}