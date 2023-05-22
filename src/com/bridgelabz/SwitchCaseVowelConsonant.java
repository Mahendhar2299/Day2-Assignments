package com.bridgelabz;

import java.util.Scanner;

public class SwitchCaseVowelConsonant {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char inputChar=scanner.next().toLowerCase().charAt(0);
        switch (inputChar) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(inputChar + " is a vowel");
            default -> System.out.println(inputChar + " is a consonant");
        }
    }

}
