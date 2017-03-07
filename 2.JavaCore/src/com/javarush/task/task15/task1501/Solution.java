package com.javarush.task.task15.task1501;

/* 
ООП - Расставить интерфейсы
*/

public class Solution {
    public static void main(String[] args) {

    }

//    public interface Movable {
//        boolean isMovable();
//    }
//
//    public interface Sellable {
//        Object getAllowedAction(String name);
//    }
//
//    public interface Discountable {
//        Object getAllowedAction();
//    }

    public static interface Movable {
        boolean getAllowedAction(String name);
    }

    public static interface Sellable {
        Object getAllowedAction(String name);
    }

    public static interface Discountable {
        Object getAllowedAction();
    }

//    public static class Clothes {
//    }
    public static class Clothes implements Sellable, Discountable
    {
        /*public boolean getAllowedAction(String name){
            return true;
        }*/
        public Object getAllowedAction(String name) {
            return "1";
        }

        public Object getAllowedAction() {
            return 2;
        }
    }
}
