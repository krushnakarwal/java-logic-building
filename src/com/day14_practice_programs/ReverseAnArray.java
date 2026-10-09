package com.day14_practice_programs;

import java.util.Scanner;

public class ReverseAnArray {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter " + size + " Element : ");
		for(int i = 0; i < arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Reverse Array is : ");
		for(int i = arr.length-1;i >=0; i--)
		{
			System.out.println(arr[i]);
		}
		sc.close();
		
	}

}
