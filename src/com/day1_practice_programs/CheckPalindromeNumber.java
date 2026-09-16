package com.day1_practice_programs;

import java.util.Scanner;

public class CheckPalindromeNumber 
{
	public void palindromeNumber(int originalNumber, int number)
	{
	
	int originalnumber = originalNumber;
	int reverseNumber = 0;
	
	while(number > 0)
	{
		int lastdigit = number % 10;
		reverseNumber = reverseNumber * 10 + lastdigit;
		number = number / 10;		
	}
	
	if(originalNumber == reverseNumber)
	{
		System.out.println(originalnumber+": is Palindrome number ");
	}
	else
	{
		System.out.println(originalnumber+": is Not palindrome number");
	}
	
}
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter a original number :");
	    int originalNumber = sc.nextInt();
	    
	    System.out.println("Enter a number :");
	    int number = sc.nextInt();
	    
	    CheckPalindromeNumber obj = new CheckPalindromeNumber();
	    obj.palindromeNumber(originalNumber,number);  
	    
	    sc.close();
		
	}

}
