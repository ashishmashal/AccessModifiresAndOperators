package com.bridgelabz;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value");
        int num = sc.nextInt();
        int i=1;
        while(i <= num){
            System.out.print( i );
            i++;
            System.out.print( "+" );
        }

    }
}
