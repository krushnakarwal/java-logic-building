package com.day7_practice_programs;

import java.util.Scanner;

public class PrintNTo1 
{
	public static void main(String [] Krish)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		for(int i = n;i >= 1;i--)
		{
			System.out.println(i);
		}
		
		sc.close();
				
	}

}
