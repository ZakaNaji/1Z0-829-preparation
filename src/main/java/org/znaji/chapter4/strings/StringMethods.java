package org.znaji.chapter4.strings;

public class StringMethods {

    public static void main(String[] args) {
        final String s = "Hello, World!";
        System.out.println("The length of the string is: " + stringLength(s));
    }

    public static int stringLength(String s) {
        return s.length();
    }
}
