package com.company;

import java.util.Scanner;

public class Homework1_1 {
    public static void myHomework1(byte x) {

        short y = x;
        System.out.println(x);
        System.out.println(y);
        int z= y;
        System.out.println(z);
        long aa= z;
        System.out.println(aa);
        float bb = aa;
        System.out.println(bb);
        double cc =bb;
        System.out.println(cc);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write new variable");
        //byte x = input.nextByte();
        myHomework1(input.nextByte());
    }
}
