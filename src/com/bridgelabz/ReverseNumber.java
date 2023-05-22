package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your number to be reversed: ");
        int inputNumber = scanner.nextInt();
        int reverseNumber = 0;
        while (inputNumber != 0) {
            int remainder = inputNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            inputNumber = inputNumber / 10;
        }
        System.out.println("The reverse value of the input number is:- " + reverseNumber);
    }
}
