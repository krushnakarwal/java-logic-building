// Create a class with three methods: stepOne(), stepTwo(), and
// stepThree(). Inside stepOne(), call stepTwo(). Inside stepTwo(),
// call stepThree(). In your main method, call only stepOne().

package com.basics_programs;

public class MethodChaining 
{
	public void stepOne()
	{
		System.out.println("Step one : Step one called step two ");
		stepTwo();
	}
	
	public void stepTwo()
	{
		System.out.println("Step two : Step two called step three ");
		stepThree();
	}
	
	public void stepThree()
	{
		System.out.println("step Three : step three method here...");
	}

	public static void main(String [] args)
	{
		MethodChaining  obj = new MethodChaining ();
		obj.stepOne();
	}
}
