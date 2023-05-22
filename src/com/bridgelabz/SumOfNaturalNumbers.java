package com.bridgelabz;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your number");
        int inputNumber = scanner.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= inputNumber) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum of naturals numbers of " + inputNumber + " is: " + sum);
    }
}
