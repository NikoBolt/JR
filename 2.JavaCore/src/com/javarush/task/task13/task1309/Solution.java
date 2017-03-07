package com.javarush.task.task13.task1309;

/* 
Наследование интерфейса
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    //
    interface Movable{
        Double speed();
    }

    interface Runable extends Movable{
        Double speed(Runable runable);
    }
    //
}