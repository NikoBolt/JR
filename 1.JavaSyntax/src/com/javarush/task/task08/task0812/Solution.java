package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }

        int current = 1;  // тут текущее количество повторений
        int result = 1;  // тут максимальное количество повторений

        for (int i = 1; i < 10; i++) {
            if (arrayList.get(i-1) != arrayList.get(i)) // если соседние числа отличаются, то текущее становится первым
                current = 1;
            else { // если соседние числа одинаковые, то ++
                current++;
                if (current > result) // если текущее количество повторов больше максимального, то увеличиваем максимальное
                result = current;
            }
//            System.out.println(a);
        }

        System.out.println(result);
    }
}
