package com.javarush.task.task15.task1523;

/* 
Перегрузка конструкторов
*/

public class Solution {
    public static void main(String[] args) {

    }

    private Solution(String a){}
    private Solution(boolean a){}
    private Solution(char a){}

    Solution(int a){}
    Solution(Character a){}
    Solution(Boolean a){}

    protected Solution(Integer a){}
    protected Solution(Float a){}
    protected Solution(Double a){}

    public Solution(Object a){}
    public Solution(float a){}
    public Solution(){}
}

