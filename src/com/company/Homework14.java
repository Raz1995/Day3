package com.company;

import java.util.Scanner;

public class Homework14 {
    public static void myHomework14() {
        System.out.println("Type the values of x and y");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("Before swapping : " + x + " " + y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: " + x + "  " + y);
    }

    public static void main(String[] args) {
        myHomework14();

    }
}
