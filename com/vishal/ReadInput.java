package com.vishal;

import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        int firstNumber = 1;
        int secondNumber;

        Scanner keyboard = new Scanner(System.in);
        while(firstNumber != 0){
            System.out.println("Please Enter a number : ");
            firstNumber = keyboard.nextInt();
            System.out.println(firstNumber);
        }

        keyboard.nextLine();
        // this will consume the extra \n character.
        // now i can read nextLine()

    }
}
