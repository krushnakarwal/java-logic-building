package com.day18_practice_programs;

import java.util.Scanner;

public class LinearSearchDSA 
{
	public static void main(String [] args)
	{
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter a size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int n = arr.length, ans = -1;
		
		
		System.out.println("Enter a element in array : ");
		for(int i = 0;i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter a target to find your numebr : ");
		int  target = sc.nextInt();
		for(int i = 0;i< n;i++)
		{
			if(arr[i] == target)
			{
				ans = i;
			}
		}
		
		System.out.println("Index Number is : " + ans);
		sc.close();
	}

}
