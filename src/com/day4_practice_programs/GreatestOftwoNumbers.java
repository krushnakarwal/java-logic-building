// Accept two numbers and write a program 
// to find and return the greatest of two number?


package com.day4_practice_programs;
import java.util.*;
public class GreatestOftwoNumbers 
{
	public int findGreatest(int a, int b) 
	    {
	        if( a > b)
	            {
	                return a;
	            }
	            else
	            {
	                return b;
	            }
	    }
	        
	public static void main(String [] args)
	{
		GreatestOftwoNumbers  obj = new GreatestOftwoNumbers ();

	    Scanner sc = new Scanner(System.in);

	    System.out.println("Enetr a first number :");
	    int a = sc.nextInt();
	    System.out.println("Enter a second number :");
	    int b = sc.nextInt();

	    int Result = obj.findGreatest(a,b);
	    System.out.println("Grater number is : "+Result);

	    sc.close();

	  }
	        
}



