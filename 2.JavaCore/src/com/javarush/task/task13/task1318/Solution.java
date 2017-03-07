package com.javarush.task.task13.task1318;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.FileInputStream;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            FileInputStream fileInputStream = new FileInputStream(bufferedReader.readLine());

            while (fileInputStream.available()>0) {
                System.out.print((char)fileInputStream.read());
            }

            fileInputStream.close();
            bufferedReader.close();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}