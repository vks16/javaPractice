package com.vishal;
//
//import javax.swing.*;
//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class ReadFile {
//    public static void main(String[] args) throws IOException {
//        File file = new File("output.txt");
//        Scanner sc = new Scanner(file);
//
//        while(sc.hasNext()){
//            JOptionPane.showMessageDialog(null, sc.nextLine());
//        }
//    }
//}

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("output.txt");
        Scanner sc = new Scanner(file);

        while(sc.hasNext()){
            JOptionPane.showMessageDialog(null, sc.nextLine());
        }
    }
}
