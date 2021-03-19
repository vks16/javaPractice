package com.vishal;

import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("args = " + Arrays.deepToString(args));
        byte a = (byte)129; // This will print -127. because after 127, byte will circle back to -128
        // range -128 to 127

        final short b = 216;  // 2 bytes  final means constant
        int c = 39933; // 4 bytes
        long d = 333333; // 8 bytes

        float e = 3.4f; // 4 bytes
        double f = 3.44; // 8 bytes

        boolean h = true;  // 1 bit

        String g = "Vishal"; // it is a class

        System.out.println(333 == 333f);
    }
}
