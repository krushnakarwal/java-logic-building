package com.day10_practice_programs;
import java.util.*;
public class NumberIsPalindromic 
{
	public static void solve(String inputStr) 
	{
	        int input = Integer.parseInt(inputStr.trim());
	        
	        int reverseNumber = 0;
	        int originalNumber = input;
	        
	        while(input > 0)
	        {
	            int lastDigit = input % 10;
	            reverseNumber = (reverseNumber * 10) + lastDigit;
	            input /= 10;
	        }

	        if(reverseNumber == originalNumber)
	        {
	            System.out.println("Palindromic number");
	        }
	        else
	        {
	            System.out.println("No Palindromic number");
	        }
	        
	    }

	    public static void main(String [] args)
	    {
	        Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number : ");
            String input = sc.nextLine();
	        NumberIsPalindromic.solve(input);
	        sc.close();
	    }

	}

