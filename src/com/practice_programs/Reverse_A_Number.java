package com.practice_programs;

import java.util.Scanner;

public class Reverse_A_Number 
{
	public void reverseNumber(int number)
	{
		int reverse = 0;
		
		while(number != 0)
		{
			int digit = number % 10;
			reverse = reverse * 10 +digit;
			number = number / 10;
		}
		
		System.out.println("Revrse number is : "+reverse);
	}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter a number :");
		int number = sc.nextInt();
		
		Reverse_A_Number  obj = new Reverse_A_Number();
		obj.reverseNumber(number);
		
		sc.close();
	}

}
