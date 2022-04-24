package com.bridgelabz;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r,sum=0,temp;
        System.out.println("Enter No");
        int no=sc.nextInt();
        System.out.println("Entered No Is " + no);
        temp=no;
        while(no>0){
            r=no%10;
            sum=(sum*10)+r;
            no=no/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
