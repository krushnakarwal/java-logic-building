/* Write a program that accept's user name and
age as input and then prints a greeting massage
in the following format: 
"Hello Krushna you are 21 years old." */


package com.krushna.logic.day_1;
import java.util.*;
public class GreetTheUser 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a name :");
		String name = sc.next();
        
		System.out.println("Enter a age :");
		int age = sc.nextInt();
		
		System.out.println("Hello " + name + " you are " + age + " years old.");
		
		sc.close();
		
	}

}
