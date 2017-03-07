package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args)
            //
            throws IOException
            //
    {
        // напишите тут ваш код
        String fileName = "";
        //System.out.println("Введите имя файла:");
        try (Scanner reader = new Scanner(new InputStreamReader(System.in))) {
            fileName = reader.nextLine();
            /*if (fileName.isEmpty()) {
                throw new IllegalArgumentException("Не указано имя файла");
            }*/
        }
        File file = new File(fileName);
        /*if (!file.exists() || file.isDirectory()) {
            throw new IllegalArgumentException("Файл не существует");
        }*/
        ArrayList<Integer> array = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextInt()) {
                int value = scanner.nextInt();
                if (value % 2 == 0) {
                    array.add(value);
                }
            }
        }
        Collections.sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
