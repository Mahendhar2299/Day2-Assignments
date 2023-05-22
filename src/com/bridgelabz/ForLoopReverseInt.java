package com.bridgelabz;

public class ForLoopReverseInt {
    public static void main(String[] args) {
        int inputNumber = 12789;
        int reverse = 0;
        for (; inputNumber != 0; ) {
            int remainder = inputNumber % 10;
            reverse = reverse * 10 + remainder;
            inputNumber = inputNumber / 10;
        }
        System.out.println("The reverse value of the input number is:- " + reverse);
    }
}
