package com.day14_practice_programs;

import java.util.Scanner;

public class GreatestNumberInArray 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter " + size + " elements : ");
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	
		int max = arr[0];
		int maxIndex = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > max) 
			{
				max = arr[i];
				maxIndex = i;
			}
		}
		
		System.out.println("Max Element " + max + " = at Index : " + maxIndex);
		sc.close();
	}

}
