// Write a program Take three numbers and find the biggest one using if-else.

package com.day1_practice_programs;

import java.util.Scanner;

public class LargestOfThreeNumbers 
{
	
	public void find_largest_number(int n1, int n2, int n3)
	{
		if(n1>n2 && n1>n3)
		{
			System.out.println("n1 is largest number :"+n1);
		}
		else if(n2>n1 && n2 >n3)
		{
			System.out.println("n2 is largest number :"+n2);
		}
		else
		{
			System.out.println("n3 is largest numebr :"+n3);
		}
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a first number :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a second number :");
		int num2 = sc.nextInt();
		
		System.out.println("Enter a third number :");
		int num3 = sc.nextInt();
		
		
		LargestOfThreeNumbers obj = new LargestOfThreeNumbers ();
		obj.find_largest_number(num1, num2, num3);
		
		sc.close();
		
		
		
		
	}

}
