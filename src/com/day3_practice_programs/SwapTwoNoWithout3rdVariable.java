package com.day3_practice_programs;

import java.util.Scanner;

public class SwapTwoNoWithout3rdVariable 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter a first number a : ");
		int a = sc.nextInt();
			
		System.out.println("Enetr a second number b : ");
		int b = sc.nextInt();
			
		System.out.println("Before Swapping a : "+ a);
		System.out.println("Before Swapping b : "+ b);
			
		System.out.println();
			
		a = a + b;
		b = a - b;
		a = a - b;
			
		System.out.println("After Swapping a : "+a);
		System.out.println("After Swapping b : "+b);
			
		sc.close();
	}

}
