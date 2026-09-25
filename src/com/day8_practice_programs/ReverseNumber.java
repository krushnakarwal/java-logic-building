package com.day8_practice_programs;

import java.util.Scanner;

public class ReverseNumber 
{
	public static void main(String [] Krish)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
	    int reverseNumber = 0;
	    
	    while(n > 0)
	    {
	    	int lastDigit = n % 10;
	    	reverseNumber = (reverseNumber * 10) + lastDigit;
	    	n /= 10;
	    }
	    
	    System.out.println(reverseNumber);
	    sc.close();
		
	}

}
