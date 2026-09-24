// Write a program to take a whole number from the keyboard
// using Scanner and print it.

package com.day1_practice_programs;

import java.util.Scanner;

public class ScannerInteger 
{
	public void printMassage(int number)
	{
		System.out.println("Number is :" + number);
	}
	
	public static void main(String [] args)
	{
		ScannerInteger obj = new ScannerInteger();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr a numebr :");
		int num = sc.nextInt();
		
		obj.printMassage(num);
		
		sc.close();
		
	}

}
