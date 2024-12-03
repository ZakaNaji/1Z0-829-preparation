package org.znaji.chapter4.math;

public class MathApp {

    public static void main(String[] args) {
        final short s = 10;
        final byte b = 5;

        System.out.println("-----------------Min Max-----------------");
        System.out.println(Math.min(s, b));
        System.out.println(Math.max(s, b));

        //round
        System.out.println("-----------------Round-----------------");
        long round = Math.round(123.5);
        long low = Math.round(123.45);
        long high = Math.round(123.55);
        int lowFloat = Math.round(123.45f);
        System.out.println(low + " " + high + " " + lowFloat + " " + round);

        //floor ceil
        System.out.println("-----------------Floor Ceil-----------------");
        double floor = Math.floor(123.45);
        double ceil = Math.ceil(123.45);
        System.out.println(floor + " " + ceil);

        //pow
        System.out.println("-----------------Pow-----------------");
        System.out.println("2^3 = " + Math.pow(2, 3));

        //random
        System.out.println("-----------------Random-----------------");
        System.out.println("random number between 0 and 1: " + Math.random());
    }
}
