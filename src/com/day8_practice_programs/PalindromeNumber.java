package com.day8_practice_programs;

import java.util.Scanner;

public class PalindromeNumber 
{
	public static void main(String [] Krish)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
	    int reverseNumber = 0;
	    int originalNumber = n;
	    
	    while(n > 0)
	    {
	    	int lastDigit = n % 10;
	    	reverseNumber = (reverseNumber * 10) + lastDigit;
	    	n /= 10;
	    }
	    
	    if (reverseNumber == originalNumber)
	    {
	    	System.out.println("Palindrome Number : "+ originalNumber);
	    }
	    else
	    {
	    	System.out.println("Not a palindrome Number : "+ originalNumber);
	    }
	    
	    sc.close();
	}
}
