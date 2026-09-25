package com.day5practice_programs;

import java.util.Scanner;

public class SurfaceAreaOfSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Radius of the Sphere (r): ");
        double r = sc.nextDouble();
        
        double area = 4 * Math.PI * r * r;
        
        System.out.printf("Surface Area of the Sphere = %.2f\n", area);

        sc.close();
    }
}