package com.bridgelabz;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        //double a = 2.3, b = 4, c = 5.6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value For A");
        double a= sc.nextDouble();
        System.out.println("Enter Value For B");
        double b= sc.nextDouble();
        System.out.println("Enter Value For C");
        double c= sc.nextDouble();
        double root1, root2;


        double delta = b * b - 4 * a * c;


        if (delta > 0) {


            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }


        else if (delta == 0) {


            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }


        else {


            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-delta) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
