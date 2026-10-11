package com.day19_practice_programs;

import java.util.Scanner;

public class BinarySearchDSA 
{
	public void print(int[] arr, int target)
	{
		int start = 0;
		int end = arr.length - 1;
		int ans = -1;
		
		while(start <= end)
		{
			int mid = start + (end - start) / 2;
			
			if(arr[mid] == target)
			{
				ans = mid;
				break;
			}
			else if(arr[mid] < target)
			{
				start = mid + 1;
			}
			else
			{
				end = mid - 1;
			}
		}
		
		if(ans != -1)
		{
		    System.out.println("Find target " + arr[ans] + " index no " + ans);
		}
		else
		{
			System.out.println("Target not found ");
		}
	}

	public static void main(String [] args)
	{
		BinarySearchDSA obj = new BinarySearchDSA();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a size of element : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Elements are : ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter your target : ");
		int target = sc.nextInt();
		obj.print(arr,target);
		sc.close();
		
	}
}
