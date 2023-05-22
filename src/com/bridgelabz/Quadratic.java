package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value 'a'");
        double a = scanner.nextDouble();
        System.out.println("Enter value 'b'");
        double b = scanner.nextDouble();
        System.out.println("Enter value 'c'");
        double c = scanner.nextDouble();
        double delta = b * b - 4 * a * c;
        System.out.println("The value of 'Delta' is: " + delta);
        if (a == 0) {
            System.out.println("'a' value must be greater than Zero''0");
        } else if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("The value of X1 is: " + x1);
            System.out.println("The value of X2 is: " + x2);
        } else if (delta == 0) {
            double x = -b / 2 * a;
            System.out.println("The value of X is: " + x);
        } else
            System.out.println("roots are imaginary");
    }
}
