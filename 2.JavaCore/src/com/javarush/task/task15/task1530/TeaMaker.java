package com.javarush.task.task15.task1530;

/**
 * Created by ������� on 07.03.2017.
 */
public class TeaMaker extends DrinkMaker{
    @Override
    public void getRightCup(){
        System.out.println("����� ����� ��� ���");
    }
    @Override
    public void putIngredient(){
        System.out.println("�������� ���");
    }
    @Override
    public void pour(){
        System.out.println("�������� �����");
    }
}
