package com.day14_practice_programs;

import java.util.Scanner;

public class SecondGreatestNumInArray 
{
	public static void main(String [] krish)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		System.out.println("Enter " + size + " elements : ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				secondMax = max;
				max = arr[i];
			}
			else if(arr[i]>secondMax)
			{
				secondMax = arr[i];
			}
		}
		
		System.out.println("Second Max Array is : " + secondMax);
		sc.close();
		
	
	}

}
