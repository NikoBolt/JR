package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date startDate = new Date(date);
        Date currentDate = new Date();
        long distance  = currentDate.getTime()-startDate.getTime();
        int msInDay = 1000*60*60*24;
        long daysToToday = distance / msInDay;

//        return true;
        return (daysToToday%2==0);
    }
}
