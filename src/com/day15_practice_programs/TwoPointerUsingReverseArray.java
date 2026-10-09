package com.day15_practice_programs;
import java.util.*;
import java.util.Arrays;
public class TwoPointerUsingReverseArray 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of an array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int start = 0;
		int end = arr.length-1;
		
		System.out.println("Element are : ");
		for(int i = 0;i < arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Reverse Array is : ");
		while(start < end)
		{
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		System.out.println(Arrays.toString(arr));
		sc.close();
		
	}

}
