package com.bridgelabz;

import java.util.Scanner;

public class Unit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No ");
        int num = sc.nextInt();
        if(num == 1 ){
            System.out.println("You Entered One Unit");
        } else if (num == 10) {
            System.out.println("You Entered Ten Unit");
        } else if (num == 100) {
            System.out.println("You Entered Hundred Unit");
        } else if (num == 1000) {
            System.out.println("You Entered Thousand Unit");
        } else if (num == 10000) {
            System.out.println("You Entered Ten Thousand Unit ");
        } else {
            System.out.println("Enter Valid No Unit ");
        }

    }
}
