package com.company;

import java.util.Scanner;

public class Homework2 {
    public static void myHomework2(double aa) {
        float bb = (float) aa;
        long cc = (long) bb;
        int dd = (int) cc;
        short ff = (short) dd;
        byte gg = (byte) ff;

        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);
        System.out.println(dd);
        System.out.println(ff);
        System.out.println(gg);

    }

    public static void main(String[] args) {
        Scanner new1 = new Scanner(System.in);
        System.out.println("Write double type variable");
        //double aa = new1.nextDouble();
        myHomework2(new1.nextDouble());
    }
}


