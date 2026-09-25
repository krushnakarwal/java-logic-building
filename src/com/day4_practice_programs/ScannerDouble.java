// Take a decimal number (like a product price 99.50) 
// from the user and print it.


package com.day4_practice_programs;

import java.util.Scanner;

public class ScannerDouble 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a product price :");
		double p_price = sc.nextDouble();
		
		System.out.println("Product price is :"+p_price);
		
		sc.close();
	}

}
