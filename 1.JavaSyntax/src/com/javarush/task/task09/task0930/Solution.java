package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код
        String[] list = new String[array.length];
        int[] nums = new int[array.length];

        for (int i=0; i<array.length; i++){
            if (isNumber(array[i])) nums[i]=Integer.parseInt(array[i]);
            else list[i]=array[i];
        }

        for(int i=0;i<list.length;i++){
            if (list[i]!=null){
                for(int j=i+1;j<list.length;j++)
                {
                    if (list[j]!=null)
                    {
                        if (isGreaterThan(list[i], list[j]))
                        {
                            String buff = list[i];
                            list[i] = list[j];
                            list[j] = buff;
                        }
                    }
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            if (nums[i]!=0){
                for(int j=i+1;j<nums.length;j++)
                {
                    if (nums[j]!=0)
                    {
                        if (nums[i]<nums[j])
                        {
                            int buff = nums[i];
                            nums[i] = nums[j];
                            nums[j] = buff;
                        }
                    }
                }
            }
        }

        for (int i=0; i<array.length; i++){
            if (isNumber(array[i])) array[i]= Integer.toString(nums[i]);
            else array[i]=list[i];
        }
        //
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
