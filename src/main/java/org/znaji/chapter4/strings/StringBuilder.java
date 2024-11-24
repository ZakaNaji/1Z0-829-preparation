package org.znaji.chapter4.strings;

public class StringBuilder {

    public static void main(String[] args) {
        //common methods
        java.lang.StringBuilder sb = new java.lang.StringBuilder("animals");
        System.out.println(sb.length());//7
        System.out.println(sb.capacity());//15
        String sub = sb.substring(2, 5);
        System.out.println(sub);//ima
        System.out.println(sb);//animals
        System.out.println(sb.charAt(0));//a
        System.out.println(sb.indexOf("a"));//0
        System.out.println(sb.indexOf("a", 1));//4
        System.out.println(sb.indexOf("a", 5));//-1

    }
}
