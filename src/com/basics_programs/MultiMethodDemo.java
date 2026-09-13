/* Create a class with two different methods: start() which prints
"Engine Started" and stop() which prints "Engine Stopped".
Call both in order using a single object. */


package com.basics_programs;

public class MultiMethodDemo 
{
	public void start()
	{
		System.out.println("Engine Started");
	}
	
	public void stop()
	{
		System.out.println("Engnine Stopped");
	}
	
	
	public static void main (String [] args)
	{
		MultiMethodDemo obj = new MultiMethodDemo();
		obj.start();
		obj.stop();
	}

}
