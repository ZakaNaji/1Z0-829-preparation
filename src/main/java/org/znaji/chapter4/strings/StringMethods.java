package org.znaji.chapter4.strings;

public class StringMethods {

    public static void main(String[] args) {
        final String s = "Hello, World!";
        //char at index
        //System.out.println(charAt(s, 0));
        //System.out.println(charAt(s, 100));//StringIndexOutOfBoundsException

        //index of
        //System.out.println(s.indexOf('o'));
        //System.out.println(s.indexOf('o', 5));
        //System.out.println(s.indexOf("World"));
        //System.out.println(s.indexOf("World", 7));
        //System.out.println(s.indexOf("World", 8));//-1
        //System.out.println(s.indexOf("\u0048"));//0

        //substring
        //System.out.println(s.substring(7));
        //System.out.println(s.substring(7, 12));//end index is exclusive
        //System.out.println(s.substring(7, 13));//StringIndexOutOfBoundsException
        //System.out.println(s.substring(7, 6));//StringIndexOutOfBoundsException

        //case conversion
        //System.out.println(s.toLowerCase());//hello, world!
        //System.out.println(s.toUpperCase());//HELLO, WORLD!

        //comparison
        //System.out.println("ABC".equals("abc"));//false
        //System.out.println("ABC".equalsIgnoreCase("abc"));//true

        //search
        //System.out.println("Hello, World!".contains("World"));//true
        //System.out.println("Hello, World!".startsWith("Hello"));//true
        //System.out.println("Hello, World!".endsWith("World!"));//true

        //replace
        //System.out.println("Hello, World!".replace("World", "Java"));//Hello, Java!
        //System.out.println("Hello, World!".replace("world", "Java"));//Hello, World! (no change)
        //System.out.println("Hello, World!".replace('o', 'O'));//HellO, WOrld! (all occurrences)

        //whitespace
        //tirm vs strip
        //System.out.println('\u2000');//en quad
        //System.out.println(" \u2000 Hello, World! \u2000 ".trim());//  Hello, World!  
        //System.out.println(" \u2000 Hello, World! \u2000 ".strip());//Hello, World! (no en quad)
        //System.out.println(" \u2000 Hello, World! \u2000 ".stripLeading());//Hello, World! (no en quad)
        //System.out.println(" \u2000 Hello, World! \u2000 ".stripTrailing());//   Hello, World! (no en quad)

        //indent
        //System.out.println("Hello, World!".indent(5));//     Hello, World!
        //System.out.println("       Hello, World!".indent(-5));//Hello, World!
        //System.out.println("      Hello, World!".stripIndent());//Hello, World!

        //translatesEscape
        //System.out.println("Hello\\nWorld!"); //Hello\nWorld!
        //System.out.println("Hello\\nWorld!".translateEscapes());//Hello
        //World!

        //Blaank vs empty
        //System.out.println("".isBlank());//true
        //System.out.println(" ".isBlank());//true
        //System.out.println("".isEmpty());//true
        //System.out.println(" ".isEmpty());//false
    }

    public static int stringLength(String s) {
        return s.length();
    }

    public static char charAt(String s, int index) {
        return s.charAt(index);
    }
}
