package com.company;

import java.util.Scanner;

public class Palidromenumber {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter test number");
        int number = scan.nextInt();
        int org_number=number;
        int temp_number=0;
        while (number!= 0){
            temp_number = temp_number*10+number%10;
            number = number/10;
        }
        if (temp_number==org_number)
            System.out.println("is a palindrome");
        else
            System.out.println("not a palindrome");
    }
}
