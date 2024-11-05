package org.znaji.chapter1.text.block;

public class TextBlockDemo {
    public static void main(String[] args) {
        final String textBlock = """
                    Line1
                  Line2
                    Line3
                         Line4\
                """;
        System.out.println(textBlock);
    }
}
