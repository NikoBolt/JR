package com.javarush.task.task09.task0927;

import java.util.*;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        Map<String, Cat> map = new HashMap<String, Cat>();

        Cat cat1 = new Cat("Кот1");
        Cat cat2 = new Cat("Кот2");
        Cat cat3 = new Cat("Кот3");
        Cat cat4 = new Cat("Кот4");
        Cat cat5 = new Cat("Кот5");
        Cat cat6 = new Cat("Кот6");
        Cat cat7 = new Cat("Кот7");
        Cat cat8 = new Cat("Кот8");
        Cat cat9 = new Cat("Кот9");
        Cat cat10 = new Cat("Кот10");
        map.put(cat1.toString(), cat1);
        map.put(cat2.toString(), cat2);
        map.put(cat3.toString(), cat3);
        map.put(cat4.toString(), cat4);
        map.put(cat5.toString(), cat5);
        map.put(cat6.toString(), cat6);
        map.put(cat7.toString(), cat7);
        map.put(cat8.toString(), cat8);
        map.put(cat9.toString(), cat9);
        map.put(cat10.toString(), cat10);

        /*BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Cat> map = new HashMap<String, Cat>();
        for (int i = 0; i < 10; i++)
        {
            String name = reader.readLine();
            Cat cat = new Cat(name);
            map.put(name, cat);
        }*/

        return map;
        //
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<Cat>();
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Cat s = iterator.next().getValue();
            set.add(s);
        }
        return set;
        //
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
