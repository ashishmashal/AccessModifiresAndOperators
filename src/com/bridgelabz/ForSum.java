package com.bridgelabz;

import java.util.Scanner;

public class ForSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
        int num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.print( i );
            System.out.print("+");
        }

    }
}
