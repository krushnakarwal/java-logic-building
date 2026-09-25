// Strong number means sum of factorial numebrs

package com.day8_practice_programs;

import java.util.Scanner;

public class StrongNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr a number : ");
		int n = sc.nextInt();
		
		int originalNumber = n;
		int sum = 0;
		
		while(n > 0)
		{
			int lastDigit = n % 10;
			
			int fact = 1;
			for(int i = 1;i <= lastDigit;i++)
			{
				fact *= i;
			}
			
			sum += fact;
			n /= 10;
				
			
		}
		
		if(sum == originalNumber)
		{
			System.out.println("Strong Number : "+sum);
		}
		else
		{
			System.out.println("Not a Strong number :"+sum);
		}
		
		sc.close();
	}

}
