package com.day1_practice_programs;

public class SwapToNumbers 
{
	
	public static void main(String [] args)
	{
		int a = 10;
		int b = 20;
		
		System.out.println("A Swapping before..." + a);
		System.out.println("B Swapping before..." + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("A Swapping after..." + a);
		System.out.println("B Swapping after..." + b);
	}

}
