package com.day8_practice_programs;

import java.util.Scanner;

public class SeparateEachDigitOfANumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr a number :");
		int n = sc.nextInt();
		
		while(n > 0)
		{
			int lastDigit = n % 10;
			System.out.print(lastDigit + " ");
			n /= 10;
		}
	
        sc.close();
	}

}
