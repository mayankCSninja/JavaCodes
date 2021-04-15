package com.company;
import java.util.Scanner;

public class palidromestring {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("input = ");
        String input= sc.nextLine();
        String reverse = "";
        String org = input;
        for (int i = input.length()-1; i>=0;i--)
            reverse+=input.charAt(i);
        System.out.println("reverse string = " +reverse);
        if (org.equals(reverse)){
            System.out.println("yes it is a palindrome");
        } else {
            System.out.println("no not a palindrome");
        }
    }
}
