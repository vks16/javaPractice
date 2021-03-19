package com.vishal;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter("output.txt");

        writer.println("Line one 1");
        writer.println("Line two 2");

        writer.close();
    }
}
