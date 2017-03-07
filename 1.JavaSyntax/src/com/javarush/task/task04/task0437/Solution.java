package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        for (int i=10; i>0 ; i--) {
            for (int j=i-1; j<10 ; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
