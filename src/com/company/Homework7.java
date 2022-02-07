package com.company;

import java.util.Scanner;

public class Homework7 {

    public static void myHomework7(int myName) {
        int myIntName = myName;
        System.out.println(myIntName);
    }

    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        char myName =my.next().charAt(0);
        myHomework7(myName);
    }
}
