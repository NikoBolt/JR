package com.javarush.task.task15.task1523;

/**
 * Created by Tony on 07.03.2017.
 */
public class SubSolution extends Solution
{
    private SubSolution(String a){}
    private SubSolution(boolean a){}
    private SubSolution(char a){}

    SubSolution(Character a) {super(a);}
    SubSolution(int a) {super(a);}
    SubSolution(Boolean a) {super(a);}

    protected SubSolution(Integer a) {super(a);}
    protected SubSolution(Float a) {super(a);}
    protected SubSolution(Double a) {super(a);}

    public SubSolution(Object a) {super(a);}
    public SubSolution(float a) {super(a);}
    public SubSolution() {super();}
}
