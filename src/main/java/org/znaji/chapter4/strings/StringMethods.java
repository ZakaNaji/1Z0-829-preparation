package org.znaji.chapter4.strings;

public class StringMethods {

    public static void main(String[] args) {
        final String s = "Hello, World!";
        //char at index
        //System.out.println(charAt(s, 0));
        //System.out.println(charAt(s, 100));//StringIndexOutOfBoundsException

        //index of
        System.out.println(s.indexOf('o'));
        System.out.println(s.indexOf('o', 5));
        System.out.println(s.indexOf("World"));
        System.out.println(s.indexOf("World", 7));
        System.out.println(s.indexOf("World", 8));//-1
        System.out.println(s.indexOf("\u0048"));//0
    }

    public static int stringLength(String s) {
        return s.length();
    }

    public static char charAt(String s, int index) {
        return s.charAt(index);
    }
}
