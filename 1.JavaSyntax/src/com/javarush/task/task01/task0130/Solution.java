package com.javarush.task.task01.task0130;

/* 
Наш первый конвертер!
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiumToFahrenheit(40));
    }

    public static double convertCelsiumToFahrenheit(int celsium) {
        //напишите тут ваш код

//        такое не проходит
//        double result = (9 * celsium / 5 ) + 32;
//        return result;

        return celsium * 1.8 + 32;
    }
}