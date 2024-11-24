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

        //append
        sb.append("-").append(1).append(' ').append(true).append(" ").append(2.0);
        System.out.println(sb);//animals-1 true 2.0

        //insert
        sb.insert(7, "-").insert(8, 1).insert(9, ' ').insert(10, true).insert(11, " ").insert(12, 2.0);
        System.out.println(sb);//animals-1 true 2.0-1 true 2.0
        //sb.insert(100, "!");//StringIndexOutOfBoundsException

        //delete
        sb.delete(7, 13);
        System.out.println(sb);//animals-1 true 2.0
        sb.delete(7, 100);//no exception
        System.out.println(sb);//animals
        //sb.deleteCharAt(100);//StringIndexOutOfBoundsException

    }
}
