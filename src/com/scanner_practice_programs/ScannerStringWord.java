// Take a single word input (like your first name)
// using sc.next() and print it with a "Hello " prefix.


package com.scanner_practice_programs;

import java.util.Scanner;

public class ScannerStringWord 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first name : ");
		String name = sc.next();
		
		System.out.println("Hello "+name);
		
		sc.close();
	}

}
