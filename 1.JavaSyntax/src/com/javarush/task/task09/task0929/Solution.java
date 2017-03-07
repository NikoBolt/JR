package com.javarush.task.task09.task0929;

import java.io.*;

/* 
Обогатим код функциональностью!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sourceFileName = reader.readLine();
        //
        do {
            try {
                if (!new File(sourceFileName).exists())
                {
                    throw new IOException();
                }
            }catch (IOException e) {
                System.out.println("Файл не существует.");
                sourceFileName = reader.readLine();
            }
        }while (!new File(sourceFileName).exists());
        //
        String destinationFileName = reader.readLine();

//        InputStream fileInputStream = getInputStream(sourceFileName);
//        OutputStream fileOutputStream = getOutputStream(destinationFileName);
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFileName);

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            fileOutputStream.write(data);
        }

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

