package com.javarush.task.task12.task1219;

/* 
Fly, Run, Swim для классов Human, Duck, Penguin, Airplane
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Run {
        public void run();
    }

    public interface Swim {
        public void swim();
    }


    public    abstract    class Human    implements Run, Swim    {

    }

    public    abstract    class Duck    implements Run,Fly, Swim    {

    }

    public    abstract    class Penguin    implements Run, Swim    {

    }

    public    abstract    class Airplane    implements Run,Fly    {

    }
}
