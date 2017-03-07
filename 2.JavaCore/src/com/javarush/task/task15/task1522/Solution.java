package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Закрепляем Singleton pattern
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут
    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void readKeyFromConsoleAndInitPlanet() {
        // implement step #5 here - реализуйте задание №5 тут
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            String buffer = in.readLine();
            if(buffer.equals(Planet.SUN))
            {
                thePlanet = Sun.getInstance();
            }
            else if(buffer.equals(Planet.EARTH))
            {
                thePlanet = Earth.getInstance();
            }
            else if(buffer.equals(Planet.MOON))
            {
                thePlanet = Moon.getInstance();
            }
            else{
                thePlanet = null;
            }
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

}
