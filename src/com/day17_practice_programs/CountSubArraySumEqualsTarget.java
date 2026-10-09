package com.day17_practice_programs;

import java.util.Scanner;

public class CountSubArraySumEqualsTarget 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of elements : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter a target number : ");
		int target = sc.nextInt();
		int sum = 0, count = 0;
		
		System.out.println("Elements are : ");
		
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0;i<arr.length;i++)
		{
			sum = 0;
			for(int j = i;j < arr.length;j++)
			{
				sum += arr[j];
				if(sum == target)
				{
					count++;
				}
			}
		}
		
		System.out.println("Count Sub Array Equals To Target " +count+" Times.");
		sc.close();
	}

}
