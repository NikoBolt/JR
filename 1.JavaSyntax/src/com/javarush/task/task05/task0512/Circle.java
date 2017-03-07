package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
*/

public class Circle {
    //напишите тут ваш код
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;

    public void initialize(int x, int y, int r)
    {
        centerX = x;
        centerY = y;
        radius = r;
    }
    public void initialize(int x, int y, int r, int w)
    {
        centerX = x;
        centerY = y;
        radius = r;
        width = w;
    }
    public void initialize(int x, int y, int r, int w, String c)
    {
        centerX = x;
        centerY = y;
        radius = r;
        width = w;
        color = c;
    }

    public static void main(String[] args) {

    }
}
