package com.bridgelabz;

import java.util.Scanner;

public class NumToWord {
    public static void main(String[] args) {
        //Input From User
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No ");
        int num = sc.nextInt();
        if(num == 0 ){
            System.out.println("You Entered zero");
        }
        else if (num == 1) {
            System.out.println("You Entered one");
        } else if (num == 2) {
            System.out.println("You Entered Two");
        } else if (num == 3) {
            System.out.println("You Entered Four");
        } else if (num == 4) {
            System.out.println("You Entered Five");
        } else if (num == 5) {
            System.out.println("You Entered Six");
        } else if (num == 6) {
            System.out.println("You Entered Seven");
        } else {
            System.out.println("Enter Valid No");
        }

    }
}
