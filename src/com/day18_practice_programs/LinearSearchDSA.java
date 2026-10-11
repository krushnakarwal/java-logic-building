package com.day18_practice_programs;

import java.util.Scanner;

public class LinearSearchDSA 
{
	public void Print(int[] arr, int target)
	{
		int n  = arr.length;
		int ans = -1;
		for(int i  = 0;i<n;i++)
		{
			if(arr[i] == target)
			{
				ans = i;
				break;
			}
			
		}
		System.out.println("Find target " + arr[ans] + " index no " + ans);
	
	}
	
	public static void  main(String [] args)
	{
		LinearSearchDSA  obj = new LinearSearchDSA();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of element : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Element are : ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter your target : ");
		int  target = sc.nextInt();
		obj.Print(arr,target);
		sc.close();
		
	}
}
