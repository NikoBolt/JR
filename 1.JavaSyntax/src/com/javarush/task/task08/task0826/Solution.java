package com.javarush.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Пять победителей
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //напишите тут ваш код
        int[] yarra = array;
        Arrays.sort(yarra);

        for (int i=0; i<yarra.length; i++)
            array[i]=yarra[yarra.length-i-1];

      /*  int temp;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if (array[j] < array[j+1])
                {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }*/


        /*int[] nums = new int[20];

        for (int i=0; i<nums.length; i++) {
            int index = 0;
            int max = array[index];
            for (int j = 0; j < array.length; j++)
            {
                if (max < array[j]){
                    max = array[j];
                    array[j] = -2147483648;
                }
            }
            nums[i]=max;
        }

        for (int i=0; i<array.length; i++)
            array[i]=nums[i];*/
    }
}
