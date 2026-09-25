// Take two integer numbers from the user,calculate their sum (a + b),
// and print the final result.


package com.day4_practice_programs;

import java.util.Scanner;

public class ScannerAddition 
{
	public static void main(String []  args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first number :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a second number :");
		int num2 = sc.nextInt();
		
		int final_result = num1 + num2;
		System.out.println("Fianl Result is :" + final_result);
		
		sc.close();
	}

}
