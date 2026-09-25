// Take three inputs together in order: Name (String), Age (int),
// and Height (double). Print them in a clean biodata format.


package com.day4_practice_programs;

import java.util.Scanner;

public class ScannerProfile {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println ("Enter your name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		System.out.println("Enter your height : ");
		double height = sc.nextDouble();
		
		System.out.println("My name is "+name+".");
		System.out.println("I am "+age+" years old.");
		System.out.println("My height is "+height+" feet");
		
		sc.close();
		

	}

}
