package com.day7_practice_programs;

import java.util.Scanner;

public class PrintNTimes 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int n = sc.nextInt();
		
	    for(int i = 1;i <= n;i++)
	    {
	    	System.out.println(i + " = Hello World");
	    }
	    
	    sc.close();
	}

}
