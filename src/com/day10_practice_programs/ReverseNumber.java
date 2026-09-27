package com.day10_practice_programs;
import java.util.*;
public class ReverseNumber
{
	public static int reverseNumber(int n) 
	{
	        int reverseNumber = 0;

	        while(n > 0)
	        {
	            int lastDigit = n % 10;
	            reverseNumber = (reverseNumber * 10) + lastDigit;
	            n /= 10;
	        }

	        return reverseNumber;
	    }

	    public static void main(String [] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number :");
	        int n = sc.nextInt();
	        int result = ReverseNumber.reverseNumber(n);

	        System.out.println(result);

	        sc.close();

	    }
	}

