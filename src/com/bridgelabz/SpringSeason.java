package com.bridgelabz;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        if ((m == 3 && (d >= 20 && d <= 31)) ||
                (m == 4 && (d <= 30)) || ((m == 5) && (d <= 31)) ||
                (m == 6 && (d >= 1 && d <= 20))) {
            System.out.println(true);
        } else
            System.out.println(false);
    }
}
