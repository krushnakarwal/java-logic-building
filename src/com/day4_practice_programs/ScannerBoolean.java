// Take a boolean input (true or false) from the user using sc.nextBoolean() 
// and print the opposite value using the NOT operator (!).



package com.day4_practice_programs;

import java.util.Scanner;

public class ScannerBoolean 
{
	public static void main (String [] args)
	{
	 	Scanner sc = new Scanner(System.in);
	
	 	System.out.println("Enter a boolean value True or False :");
	 	boolean value = sc.nextBoolean();
	
	 	boolean opposite = !value;
	 	System.out.println("Opposite Result is : "+  opposite);
	
	 	sc.close();
    }
	
}
