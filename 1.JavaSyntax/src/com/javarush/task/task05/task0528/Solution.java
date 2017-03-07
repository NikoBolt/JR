package com.javarush.task.task05.task0528;

/* 
Вывести на экран сегодняшнюю дату
*/

import java.text.SimpleDateFormat;
//import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
/*
        Calendar calendar = Calendar.getInstance();
        int date = calendar.get(Calendar.DAY_OF_MONTH);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        System.out.println(date + " " + month + " " + year);
*/
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;

        dateFormat = new SimpleDateFormat("dd MM yyyy");
        System.out.println(dateFormat.format( currentDate ) );
    }
}
