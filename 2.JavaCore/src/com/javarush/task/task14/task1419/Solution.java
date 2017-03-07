package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {
      //it's first exception
        try {
            float i = 1 / 0;

//        } catch (Exception e) {
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

        //тоже работает, копируй 9 раз
        /*try {
            throw new КакоеТоНазваниеException();
        } catch (КакоеТоНазваниеException e) {
            exceptions.add(e);
        }*/

        try {
            ArrayList<String> a = new ArrayList<String>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            b.contains(a.get(0));
            //} catch (Exception e) {
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            ArrayList<String> a = new ArrayList<String>();
            ArrayList<Integer> b = new ArrayList<Integer>();
            b.contains(a.get(0));
            //} catch (Exception e) {
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        // work in java 8
        /*try {
            Integer test = null;
            Integer test2 = 0;
            Integer.sum(test, test2);
        //} catch (Exception e) {
        } catch (NullPointerException e) {
            exceptions.add(e);
        }*/

        try {
            String test = "test";
            int test2 = Integer.parseInt(test);
            //} catch (Exception e) {
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }
        try {
            String test = "test";
            char test2 = test.charAt(100);
            //} catch (Exception e) {
        } catch (StringIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            Object i[] = new String[0];
            i[1] = new Integer(0);
            //} catch (Exception e) {
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }
        try {
            Object i = new Integer(0);
            System.out.print((String) i);
            //} catch (Exception e) {
        } catch (ClassCastException e) {
            exceptions.add(e);
        }
        try {
            InputStream stream = new FileInputStream("test");
            //} catch (Exception e) {
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
            Date lowDate = sdf.parse("test");
            //} catch (Exception e) {
        } catch (ParseException e) {
            exceptions.add(e);
        }
        try {
            String s = "sssssssss";
            Date d = new Date(s);
            //} catch (Exception e) {
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }
    }
}
