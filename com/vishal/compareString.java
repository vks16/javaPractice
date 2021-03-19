package com.vishal;

//import javax.swing.*;
//
//public class compareString {
//    public static void main(String[] args) {
//        String name1, name2;
//
//        name1 = JOptionPane.showInputDialog("Enter name 1");
//        name2 = JOptionPane.showInputDialog("Enter name 2");
//
//        if(name1.compareTo(name2) == 0){
//            JOptionPane.showMessageDialog(null, true);
//        }else{
//            JOptionPane.showMessageDialog(null, false);
//        }
//    }
//}

import javax.swing.*;

public class compareString {
    public static void main(String[] args){
        String name1, name2;

        name1 = JOptionPane.showInputDialog("Enter name 1");
        name2 = JOptionPane.showInputDialog("Enter name 2");

        if(name1.compareTo(name2) == 0){
            JOptionPane.showMessageDialog(null, true);
        }else {
            JOptionPane.showMessageDialog(null, false);
        }
    }
}
