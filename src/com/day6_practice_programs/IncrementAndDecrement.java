package com.day6_practice_programs;

public class IncrementAndDecrement 
{

	public static void main(String[] args) 
	{
		int a = 5;
		int b = a++ + ++a;
		int c = --a + a++;
		
		System.out.println(b);
		System.out.println(c);
	}

}
