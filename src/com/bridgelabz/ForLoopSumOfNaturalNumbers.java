package com.bridgelabz;

import java.util.Scanner;

public class ForLoopSumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number:- ");
        int inputNumber = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= inputNumber; i++) {
            sum += i;
        }
        System.out.println("sum of naturals numbers of " + inputNumber + " is: " + sum);
    }
}