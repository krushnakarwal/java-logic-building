package com.day7_practice_programs;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String [] argsss)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number :");
		int num = sc.nextInt();
		int count = 0;
		
		for(int i = 1; i <= num;i++)
		{
			if(num % i == 0)
			{
				count++;		
			}  
		}
		
		String primeNumber = count == 2 ? "Prime Number" : "Not a Prime Number";
	    System.out.println(primeNumber);
		
		sc.close();
	}

}



/* Big  Number Logic Because This Logic Use Faster Than Other 
 * Reason find the condition then immediately stop loop.
 *
 * 
 *   boolean isPrime = true;


        if (num <= 1) {
            isPrime = false;
        } 
        else 
        {
           for (int i = 2; i <= num / 2; i++) 
           {
            	if (num % i == 0) 
                { 
                    isPrime = false;
                    break; 
                }
            }
        }
        
        if (isPrime) 
        {
            System.out.println(num + " Prime number");
        } else 
        {
            System.out.println(num + " Not a prime number");
        }
*/