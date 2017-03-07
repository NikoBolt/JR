package com.javarush.task.task14.task1418;

import java.util.LinkedList;
import java.util.List;

/* 
Исправь 4 ошибки
*/

public class Solution {
    public static void main(String[] args) {
//        List<Number> list = new LinkedList<Number>();

        //1//
        new NotIncapsulatedClass();
    }

    public static class NotIncapsulatedClass
    {
        public NotIncapsulatedClass(){
            List<Number> list = new LinkedList<Number>();
            initList(list);
            printListValues(list);
            processCastedObjects(list);
        }
        //


        //2.1//
        private void initList(List<Number> list) {
            //

            //3
            list.add(new Double(1000f));
            list.add(new Double("123e-445632"));
            list.add(new Float(-90 / -3));
            list.remove(new Double("123e-445632"));

            //
        }
        //


        //2.2//
        private void printListValues(List<Number> list) {
            //

            //4 //6 - Исправь 2 ошибки
            for (int i = 0; i </*=*/ list.size(); i/*--*/++) {
                System.out.println(list.get(i));
            }

            //
        }
        //


        //2.3//
        private void processCastedObjects(List<Number> list) {
            //

            //5
            for (Number object : list) {
                //7 Исправь 2 ошибки
                if (object instanceof /*Float*/ Double) {
                    Double a = (Double) object;
                    System.out.println("Is float value defined? " + !(a.isNaN()));
                } else if (object instanceof /*1//Double*/ Float) {
                    Float a = (Float) object;
                    System.out.println("Is double value infinite? " + /*2//a.isInfinite()*/ a.isNaN());
                }
            }

            //
        }
        //
    }
}
