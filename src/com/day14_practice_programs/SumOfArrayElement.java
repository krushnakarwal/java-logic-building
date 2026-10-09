package com.day14_practice_programs;

import java.util.Scanner;

public class SumOfArrayElement
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int sum = 0;
		
		System.out.println("Enter " + size + " elements : ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	
		
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum+arr[i];
		}
		
		System.out.println("Sum of array elements : " + sum);
		sc.close();
	}
}