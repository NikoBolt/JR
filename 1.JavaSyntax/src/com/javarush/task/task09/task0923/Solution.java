package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        String line=reader.readLine();
        reader.close();

        ArrayList<Character> notVowels = new ArrayList<Character>();
        ArrayList<Character> vowels = new ArrayList<Character>();

        //String mas[]=s.split("");
        ArrayList<Character> list=new ArrayList<Character>();

        for(int i=0;i<line.length();i++)
        {
            char currentChar = line.charAt(i);
            boolean vowelChar = isVowel(currentChar);
            if (vowelChar) {
                vowels.add(currentChar);
            } else {
                if (currentChar != ' ') {
                    notVowels.add(currentChar);
                }
            }
        }

        for (int i = 0; i < vowels.size(); i++) {
            if (i < vowels.size() - 1) {
                System.out.print(vowels.get(i) + " ");
            } else {
                System.out.print(vowels.get(i));
            }
        }
        System.out.println();
        for (int i = 0; i < notVowels.size(); i++) {
            if (i < notVowels.size() - 1) {
                System.out.print(notVowels.get(i) + " ");
            } else {
                System.out.print(notVowels.get(i));
            }
        }
    }
    //


    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}