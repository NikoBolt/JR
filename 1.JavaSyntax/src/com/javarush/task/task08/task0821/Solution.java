package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> map = new HashMap<String, String>();
        map.put("Фамилия0","Имя0" );
        map.put("Фамилия1","Имя1" );
        map.put("Фамилия2","Имя0" );
        map.put("Фамилия1","Имя3" );
        map.put("Фамилия4","Имя4" );
        map.put("Фамилия5","Имя5" );
        map.put("Фамилия6","Имя6" );
        map.put("Фамилия7","Имя7" );
        map.put("Фамилия8","Имя8" );
        map.put("Фамилия9","Имя9" );

//        return null;
        return (HashMap<String, String>) map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
