package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лоза"); //1
        list.add("лира"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        int temp = 0;
        for(int i = 0; i < list.size(); i++){

            if (list.get(i).contains("л")) {
                temp=temp+2;
            }
            if (list.get(i).contains("р")) {
                temp++;
            }

            switch (temp)
            {
                case 1:
                    list.remove(i);
                    i--;
                    break;
                case 2:
                    list.add(i + 1, list.get(i));
                    i++;
                    break;
            }
            temp = 0;
        }

        return /*null;*/ list;
    }
}