// Write a program accept a string from user and display string  palindrome  or not.


package com.day5practice_programs;

import java.util.Scanner;

public class StringPalindrome 
{
	public void checkStringPalindrome(String name)
	{
		String originalString = name;
		String reverseString = "";
		for(int i = name.length()-1;i >=0 ;i--)
			{
				reverseString = reverseString + name.charAt(i);
			}
		
		
			if(originalString.equalsIgnoreCase(reverseString))
			{
				System.out.println(name+" : is a palidnrome String");
			}
			else
			{
				System.out.println(name+" : is a not palindrome String");
			}
	}
		
		public static void main(String [] args)
		{
			Scanner sc = new Scanner(System.in);
					
			System.out.print("Enter a name :");
			String name = sc.next();
			
			StringPalindrome obj = new StringPalindrome ();
			obj.checkStringPalindrome(name);
			
			sc.close();
			
		}
	
}
