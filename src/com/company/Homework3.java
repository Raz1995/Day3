package com.company;

import java.util.Scanner;

public class Homework3 {
    public static void myHomework3(float temperatureInFahrenheit) {
        float temperatureInCelsius = (float) ((temperatureInFahrenheit-32)/1.8);
        int temperatureInCelcius1 = (int )((temperatureInFahrenheit-32)/1.8);
        System.out.println(temperatureInCelsius);
        System.out.println(temperatureInCelcius1);

    }

    public static void main(String args[]) {
        Scanner my =new Scanner(System.in);
        System.out.println("How much the temperature in Fahrenheit");
        //float temperatureInFahrenheit = my.nextFloat();
        myHomework3(my.nextFloat());

    }
}
