package com.bridgelabz;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X");
        int x=sc.nextInt();
        System.out.println("Enter Y");
        int y=sc.nextInt();

        double dist=Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("Euclidean distance from the point (x, y) to the origin (0, 0) IS " + dist);
    }
}
