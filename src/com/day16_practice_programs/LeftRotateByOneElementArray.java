package com.day16_practice_programs;

import java.util.Scanner;
import java.util.Arrays;

public class LeftRotateByOneElementArray 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int n = arr.length;
		System.out.println("Enter left rotate by k elements : ");
		int k = sc.nextInt();
		
		k = k % n;
		
		System.out.println("Element are : ");
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		
	for(int j = 1; j<= k;j++)
	{
		int temp =  arr[0];
		
		for(int i = 1;i <n;i++)
		{
			arr[i-1] = arr[i];
		}
		
		arr[n-1] = temp;
	}
		System.out.println(Arrays.toString(arr));
		sc.close();
		
	}

}
