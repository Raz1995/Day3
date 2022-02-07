package com.company;

import java.util.Scanner;

public class Homework4 {
    public static void myHomework4 (double radius) {

        double perimeter = 2*Math.PI*radius;
        System.out.println("The perimeter will be " + perimeter);
        double area = Math.PI*Math.sqrt(radius);
        System.out.println("The area will be "+area);

    }

    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        System.out.println("Write Radius Value");
        double radius = my.nextDouble();
        myHomework4(radius);

    }
}
