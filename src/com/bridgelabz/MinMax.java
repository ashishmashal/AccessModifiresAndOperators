package com.bridgelabz;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No For a");
        int a = sc.nextInt();
        System.out.println("Enter No For b");
        int b = sc.nextInt();
        System.out.println("Enter No For c");
        int c = sc.nextInt();

        int result1= a+b*c;
        System.out.println("a+b*c is " +result1);
        int result2= c+a/b;
        System.out.println("c+a/b is " +result2);
        int result3= a%b+c;
        System.out.println("a%b+c is " +result3);
        int result4= a*b+c;
        System.out.println("a*b+c is " +result4);

        if(result1 > result2 || result1 > result3 || result1 > result4 ){
            System.out.println("result 1 Is MAX Than All ");
        }
        else if(result2 > result1 || result2 > result3 || result2 > result4 ){
            System.out.println("result 2 Is MAX Than All ");
        }
        else if (result3 > result1 || result3 > result2 || result3 > result4 ) {
            System.out.println("result 3 Is MAX Than All ");
        }
        else {
            System.out.println("result 4 Is MAX Than All ");
        }

        if(result1 < result2 || result1 < result3 || result1 < result4 ){
            System.out.println("result 1 Is MIN Than All ");
        }
        else if(result2 < result1 || result2 < result3 || result2 < result4 ){
            System.out.println("result 2 Is MIN Than All ");
        }
        else if (result3 < result1 || result3 < result2 || result3 < result4 ) {
            System.out.println("result 3 Is MIN Than All ");
        }
        else {
            System.out.println("result 4 Is MIN Than All ");
        }
    }
}
