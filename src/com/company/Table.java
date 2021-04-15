package com.company;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        System.out.println("multiple");
        for (int i =1; i<=10;i++){
            int multiple = N*i;
            System.out.println(multiple);
        }
    }
}
