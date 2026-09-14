// Take a full line text input (like your full name with
// spaces) using sc.nextLine() and print it cleanly.


package com.scanner_practice_programs;

import java.util.Scanner;

public class ScannerStringLine 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a full name : ");
		String full_name = sc.nextLine();
		
		System.out.println("My full name is : "+full_name);
		
		sc.close();
	}

}
