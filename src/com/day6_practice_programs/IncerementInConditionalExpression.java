package com.day6_practice_programs;

public class IncerementInConditionalExpression 
{
	public static void main(String [] krish)
	{
		int a = 2;
		int b = 3;
		boolean result = (a++ < b) && (b++ > a);
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);

	}

}
