// Take a single character input (like your grade 'A') 
// from the user using sc.next().charAt(0) and display it.


package com.day4_practice_programs;

import java.util.Scanner;

public class ScannerChar 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a single character :");
		char character = sc.next().charAt(0);
		
		System.out.println("Single character is : "+character);
		
		sc.close();
	}

}
