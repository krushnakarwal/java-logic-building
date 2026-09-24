// Write a program Take a year and check if it's a leap year or not.


package com.practice_programs;

import java.util.Scanner;

public class CheckLeapYear 
{
	public void checkyear(int year)
	{
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		{
			System.out.println(year+": Leap year :");
		}
		else
		{
			System.out.println(year+": Not leap year");
		}
		
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year :");
		int year = sc.nextInt();
		
		CheckLeapYear obj = new CheckLeapYear ();
		obj.checkyear(year);
		
		sc.close();
		
		
	}

}
