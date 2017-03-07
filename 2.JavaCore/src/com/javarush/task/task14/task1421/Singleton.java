package com.javarush.task.task14.task1421;

/**
 * Created by Николай on 05.03.2017.
 */
public class Singleton {
    private static Singleton instance;
    public static Singleton getInstance()
    {
        if(instance==null)
            instance=new Singleton();
        return instance;
    }
    private Singleton() {}

    /*private final static Singleton value = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){return value;
    }*/
}
