package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //напишите тут ваш код
        int[] ints = new int[6];

        for (int i=1; i<ints.length; i++){
            ints[i]=Integer.parseInt(reader.readLine());
        }

        for (int i=2; i<ints.length; i++){
            for (int j=ints.length-1; j>=i; j--){
                if (ints[j-1]>ints[j])
                {
                    ints[0] = ints[j];
                    ints[j] = ints[j - 1];
                    ints[j - 1] = ints[0];
                }
            }
        }

        for (int i = 1; i < ints.length; i++)
        {
            if (i!= ints.length-1)
                System.out.println(ints[i]);
            else
                System.out.print(ints[i]);
        }
    }
}
