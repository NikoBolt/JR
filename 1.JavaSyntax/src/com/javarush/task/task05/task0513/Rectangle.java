package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {
    //напишите тут ваш код
    private int left;
    private int top;
    private int width = 0;
    private int height = width;

    public void initialize(int t, int l, int w, int h)
    {
        left = l;
        top = t;
        width = w;
        height = h;
    }
    public void initialize(int t, int l)
    {
        left = l;
        top = t;
    }
    public void initialize(int t, int l, int w)
    {
        left = l;
        top = t;
        width = w;
    }
    public void initialize(Rectangle A)
    {
        left = A.left;
        top = A.top;
        width = A.width;
        height = A.height;
    }

    public static void main(String[] args) {

    }
}
