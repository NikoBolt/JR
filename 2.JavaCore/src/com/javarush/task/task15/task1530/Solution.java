package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        //
        DrinkMaker makeLatte = new LatteMaker();
        DrinkMaker makeTea = new TeaMaker();
        makeTea.makeDrink();
        makeLatte.makeDrink();
        //
    }
}
