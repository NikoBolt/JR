package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args)
    //
            throws Exception
    //
    {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        File file = new File(fileName);

        PrintWriter printWriter = new PrintWriter(file.getAbsoluteFile());

        List<String> strings = new LinkedList<String>();
        String line = bufferedReader.readLine();
        while(!line.equals("exit")) {
            strings.add(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        strings.add(line);

        for(String string: strings) {
            printWriter.println(string);
        }
        printWriter.close();
    }
}
