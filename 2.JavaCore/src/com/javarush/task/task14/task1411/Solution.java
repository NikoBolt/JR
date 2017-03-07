package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Looser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        key = reader.readLine();
        while (key.equals("user") || key.equals("looser")
                || key.equals("coder") || key.equals("proger"))


        {
            //создаем объект, пункт 2
            switch(key){
                case "user":
                    person = new Person.User();
                    break;
                case "looser":
                    person = new Person.Looser();
                    break;
                case "coder":
                    person = new Person.Coder();
                    break;
                case "proger":
                    person = new Person.Proger();
                    break;
            }


            doWork(person); //вызываем doWork

            //
            key = reader.readLine();
            //
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User){
            ((Person.User)person).live();
        }
        if (person instanceof Person.Coder){
            ((Person.Coder)person).coding();
        }
        if (person instanceof Person.Looser)
        {
            ((Person.Looser)person).doNothing();
        }
        if (person instanceof Person.Proger)
        {
            ((Person.Proger)person).enjoy();
        }
    }
}
