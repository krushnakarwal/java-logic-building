// Write a program thats print the sum of two numbers?

package com.krushna.logic.day_1;
import java.util.*;
public class SumOfTwoInteger 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first number :");
		int a = sc.nextInt();
		
		System.out.println("Enetr a second number :");
		int b = sc.nextInt();
		
		int sum = a + b;
		
		System.out.println("Sum of two numbers :"+sum);
		
		sc.close();
	}

}
