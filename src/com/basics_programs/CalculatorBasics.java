// Create a class with a method named addNumbers(int a, int b).
// Inside the method,print the sum (a + b). Call it from main by
// passing 10 and 20.
 

package com.basics_programs;

public class CalculatorBasics 
{
	public void addNumbers(int a, int b)
	{
		System.out.println("Sum is :" + (a+b));
		
	}
	
	public static void main(String [] args)
	{
		CalculatorBasics obj = new CalculatorBasics();
		obj.addNumbers(10, 20);
	}
}
