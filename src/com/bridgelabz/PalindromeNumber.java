package com.bridgelabz;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your number to be reversed: ");
        int inputNumber = scanner.nextInt();
        int duplicateNumber = inputNumber;
        int reverseNumber = 0;
        while (inputNumber != 0) {
            int remainder = inputNumber % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            inputNumber = inputNumber / 10;
        }
        if (reverseNumber == duplicateNumber) {
            System.out.println("It is a palindrome");
            System.out.println(reverseNumber + "   " + duplicateNumber);
        } else {
            System.out.println("It is a not palindrome");
            System.out.println(reverseNumber + "   " + duplicateNumber);
        }
    }
}
