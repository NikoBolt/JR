package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    private int top;
    private int left;
    private int width = 0;
    private int height = width;

    public Rectangle(int top, int left, int width, int height)
    {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int top, int left)
    {
        this.top = top;
        this.left = left;
    }
    public Rectangle(int top, int left, int width)
    {
        this.top = top;
        this.left = left;
        this.width = width;
    }
    public Rectangle(Rectangle A)
    {
        this.top = A.top;
        this.left = A.left;
        this.width = A.width;
        this.height = A.height;
    }

    public static void main(String[] args) {

    }
}
