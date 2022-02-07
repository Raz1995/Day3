package com.company;

import java.util.Scanner;

public class Homework6 {
    public static void myHomework6(int myBirthYear) {
        char myNameFirstLetter = 'R';
        char myNameSecondLetter = 'a';
        char myNameThirdLetter = 'z';

        System.out.println(myNameFirstLetter  + "" + myNameSecondLetter + myNameThirdLetter + " " + myBirthYear);
        /*System.out.print(myNameFirstLetter);
        System.out.print(myNameSecondLetter);
        System.out.print(myNameThirdLetter);*/
    }

    public static void main(String[] args) {
        Scanner my = new Scanner(System.in);
        int myBirthYear = 1995;
        myHomework6(myBirthYear);

    }
}
