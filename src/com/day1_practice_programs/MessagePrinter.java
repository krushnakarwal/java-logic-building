/* Create a class with a method named printWarning that prints
"Warning: System Check Required!".
Call it using an object in the main method.*/


package com.day1_practice_programs;

public class MessagePrinter 
{
	public void printWarning()
	{
		System.out.println("Warning: System Check required!");
	}
	
	public static void main(String [] args)
	{
		MessagePrinter obj = new MessagePrinter();
		obj.printWarning();
	}
}
