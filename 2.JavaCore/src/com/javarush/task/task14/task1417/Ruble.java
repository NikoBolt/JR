package com.javarush.task.task14.task1417;

/**
 * Created by Николай on 05.03.2017.
 */
public class Ruble extends Money
{
    public Ruble(double amount)
    {
        super(amount);
    }
    @Override
    public double getAmount()
    {
        return super.getAmount();
    }
    @Override
    public String getCurrencyName()
    {
        return "RUB";
    }
}