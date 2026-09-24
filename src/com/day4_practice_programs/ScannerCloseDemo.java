// Write a scanner program, call sc.close() at the end, and try to write another
// sc.nextInt() below it to observe the IllegalStateException error in the console.

package com.scanner_practice_programs;

import java.util.Scanner;

public class ScannerCloseDemo 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("First number is: " + num1);
		
		sc.close(); 
		
		System.out.println("Trying to take input after closing");
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt(); 
		
 		System.out.println("Second number is: " + num2);
	}
}
