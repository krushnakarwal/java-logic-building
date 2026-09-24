package com.day7_practice_programs;

import java.util.Scanner;

public class SumOfNNumbers 
{
	public static void main(String [] Krish)
	{
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i = 1;i <= n;i++)
		{
			sum = sum+i;
		}
		
		System.out.println("Sum : "+sum);
		
		sc.close();
	}

}
