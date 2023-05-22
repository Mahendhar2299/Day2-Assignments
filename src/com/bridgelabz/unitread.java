package com.bridgelabz;

import java.util.Scanner;

public class unitread {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number in between 0 & 9: ");
        int unitNum=scanner.nextInt();
        if (unitNum==1){
            System.out.println("one");
        } else if (unitNum==10) {
            System.out.println("Ten");
        } else if (unitNum==100) {
            System.out.println("Hundred");
        } else if (unitNum==1000) {
            System.out.println("Thousand");
        }else
            System.out.println("Enter a valid number");
    }
}
