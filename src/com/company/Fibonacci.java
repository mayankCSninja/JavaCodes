package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length = ");
        int length = sc.nextInt();
        int one = 0;
        int two = 1;
        int sum = 0;
        while (length > 0) {
            sum = one + two;
            two = one;
            one = sum;
            length--;
            System.out.print(" " +sum);
        }
    }
}
