package org.znaji.chapter1.text.block;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.out;

public class TextBlockDemo {
    private final static int I = 0;

    public static void main(String[] args) {
        byte y = -2;
        int x = switch (y) {
            case 0 -> {yield 0;}
            case -1 -> {
                out.println("y is -1");
                yield -1;
            }
            case -2 -> {
                out.println("y is -2");
                yield -2;
            }
            default -> {
                out.println("y is neither -1 nor -2");
                yield 0;
            }
        };

    }

    public void test(final int b) {
        var a = 10;
        final int c = b;
        switch (a) {
            case 10 -> out.println("a is 10");
            case I -> out.println("a is 20");
        }
    }
}
