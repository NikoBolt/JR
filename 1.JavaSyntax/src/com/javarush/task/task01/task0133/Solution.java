package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getCountSecondsPassedInCurrentHour(12345));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {
        //напишите тут ваш код
//        while (seconds > 0) {
//            seconds = seconds - 60 * 60;
//        }
//        return seconds + 60 * 60;
        return seconds % 3600;
    }
}