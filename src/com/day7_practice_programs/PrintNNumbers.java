package com.day7_practice_programs;

import java.util.Scanner;

public class PrintNNumbers 
{
	public static void main(String [] krushna)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a numebr :");
		int n = sc.nextInt();
		
		for(int i = 1;i <= n;i++)
		{
			System.out.println(i);
		}
		
		sc.close();
	}
}
