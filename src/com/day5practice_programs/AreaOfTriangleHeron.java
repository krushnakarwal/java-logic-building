package com.day5practice_programs;
import java.util.*;
public class AreaOfTriangleHeron 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter length of Side A: ");
        int a = sc.nextInt();
        
        System.out.print("Enter length of Side B: ");
        int b = sc.nextInt();
        
        System.out.print("Enter length of Side C: ");
        int c = sc.nextInt();
        
        double s = (a + b + c) / 2.0;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        
        System.out.printf("Area of the Triangle = %.2f\n",area);
        
        sc.close();
    }
}