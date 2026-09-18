package com.day1_practice_programs;

import java.util.Scanner;

public class CircleCircumferenceAndArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Radius of the Circle (r): ");
        float r = sc.nextFloat();
        
        double circumference = 2 * Math.PI * r;
        double area = Math.PI * r * r; 
        
        System.out.printf("Circumference of the Circle = %.2f\n", circumference);
        System.out.printf("Area of the Circle = %.2f\n", area);

        sc.close();
    }
}
