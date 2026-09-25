package com.day8_practice_programs;

import java.util.Scanner;

public class SumOfDigit 
{
	public static void main(String [] Krushna)
	{ 
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		int sum = 0;
		
		while(n > 0)
		{
			int lastDigit = n % 10;
			sum += lastDigit;
			n /= 10;
		}
		
		System.out.println("Sum of Digit : "+sum);
		
		sc.close();
	
	}

}
