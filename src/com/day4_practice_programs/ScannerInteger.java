// Take a whole number (like user age) from the keyboard
// using Scanner and print it back.


package com.day4_practice_programs;

import java.util.Scanner;

public class ScannerInteger 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a age :");
		int age = sc.nextInt();
		
		System.out.println("Age is : "+age);
		
		sc.close();
		
	}
}
