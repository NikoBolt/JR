package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());

            ArrayList listA = new ArrayList();
            ArrayList listB = new ArrayList();
            for (int i = 1; i <= a; i++) {
                if (a % i == 0)
                    listA.add(i);
            }
            for (int i = 1; i <= b; i++) {
                if (b % i == 0)
                    listB.add(i);
            }
            for (int i = listA.size()-1; i >= 0; i--) {
                if (listB.contains(listA.get(i))) {
                    System.out.println(listA.get(i));
                    break;
                }
            }
        }
        catch (Exception e)
        {
        }
        //
    }
}
