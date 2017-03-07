package com.javarush.task.task12.task1218;

/* 
Fly, Move, Eat для классов Dog, Car, Duck, Airplane
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Fly {
        public void fly();
    }

    public interface Move {
        public void move();
    }

    public interface Eat {
        public void eat();
    }

    public    abstract    class Dog    implements Move, Eat    {
//        public void move(){}
//        public void eat(){}
    }

    public    abstract    class Duck    implements Move, Fly, Eat    {
//        public void move(){}
//        public void fly(){}
//        public void eat(){}
    }

    public    abstract    class Car    implements Move    {
//        public void move(){}
    }

    public    abstract    class Airplane    implements Move, Fly    {
//        public void move(){}
//        public void fly(){}
    }
}
