// Write a program to check number is palindrome or not



package com.practice_programs;

import java.util.Scanner;

public class CheckPalindromeNumber 
{
	public void palindromeNumber(int number)
	{
	
	int originalNumber = number;
	int reverseNumber = 0;
	
	while(number > 0)
	{
		int lastdigit = number % 10;
		reverseNumber = reverseNumber * 10 + lastdigit;
		number = number / 10;		
	}
	
	if(originalNumber == reverseNumber)
	{
		System.out.println(originalNumber+": is Palindrome number ");
	}
	else
	{
		System.out.println(originalNumber+": is Not palindrome number");
	}
	
}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter a number :");
	    int number = sc.nextInt();
	    
	    CheckPalindromeNumber obj = new CheckPalindromeNumber();
	    obj.palindromeNumber(number);  
	    
	    sc.close();
		
	}

}
