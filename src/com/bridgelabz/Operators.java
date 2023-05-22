package com.bridgelabz;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of 'a");
        double a = scanner.nextDouble();
        System.out.println("Enter value of 'b");
        double b = scanner.nextDouble();
        System.out.println("Enter value of 'c");
        double c = scanner.nextDouble();


        double operation1 = a + b * c;
        double operation2 = c + a / b;
        double operation3 = a % b + c;
        double operation4 = a * b + c;

        double max = Math.max(Math.max(operation1, operation2), Math.max(operation3, operation4));
        double min = Math.min(Math.min(operation1, operation2), Math.min(operation3, operation4));
        System.out.println("Maximum value is: "+ max);
        System.out.println("Minimum value is: "+ min);

    }
}
