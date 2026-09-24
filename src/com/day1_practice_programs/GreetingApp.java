/* Create a class with a method that takes a String parameter 
(public void sayHello(String name)) 
and prints "Hello " + name. Pass "Krushna" from the main method. */


package com.day1_practice_programs;

public class GreetingApp 
{
	public void sayhello(String name)
	{
		System.out.println("Hello " + name);
	}
	
	public static void main(String [] args)
	{
		GreetingApp obj = new GreetingApp();
		obj.sayhello("Krushna");	
	}

}
