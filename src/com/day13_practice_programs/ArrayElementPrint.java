package com.day13_practice_programs;

import java.util.Scanner;

public class ArrayElementPrint 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Size of Array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter " + size + " Element of Array : ");
		for(int i = 0; i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println("Element are : ");
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		sc.close();
	}

}
