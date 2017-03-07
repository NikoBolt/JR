package com.javarush.task.task09.task0928;

import java.io.*;

/* 
Код не компилится…
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        String destinationFileName = reader.readLine();
        //
        reader.close();
        //

//        InputStream fileInputStream = getOutputStream(destinationFileName);
//        InputStream fileOutputStream = getOutputStream(destinationFileName);
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

        int count = 0;
        while (fileInputStream.available() > 0) ;
        {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
            count++;
        }

        System.out.println("Скопировано байт " + count);

        fileInputStream.close();
        fileOutputStream.close();
    }

//    public static InputStream getInputStream(String fileName) throws IOException {
//        return new FileInputStream(fileName);
//    }
//
//    public static OutputStream getOutputStream(String fileName) throws IOException {
//        return new FileOutputStream(fileName);
//    }
}
