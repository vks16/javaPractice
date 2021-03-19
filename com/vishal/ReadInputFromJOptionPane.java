package com.vishal;

import javax.swing.*;

public class ReadInputFromJOptionPane {
    public static void main(String[] args) {
        String name, surname;

        name = JOptionPane.showInputDialog("Please enter your first name: ");
        surname = JOptionPane.showInputDialog("Please enter your last name: ");

        JOptionPane.showMessageDialog(null, "Name : " + name + " " + surname);

        int firstNum, secondNum;
        String input;
        input = JOptionPane.showInputDialog("Enter your first Number: ");
        firstNum = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter your second Number: ");
        secondNum = Integer.parseInt(input);

        JOptionPane.showMessageDialog(null, firstNum + secondNum);
    }
}
