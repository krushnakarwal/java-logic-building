package com.day20_practice_programs;
import java.util.*;
import java.util.Arrays;
public class SelectionSortDSA 
{
	public static void selectionSort(int[] arr)
	{ 
		// Outer loop to traverse through the array
		for(int i = 0;i<arr.length - 1;i++)
		{
			int smallest = i;
			
			// Inner loop to find the index of the minimum element in the unsorted part
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[smallest])
				{
					smallest = j;
				}
			}
		
		// Swap the found minimum element with the first element of the unsorted part
		if( smallest != i)
		{
			int temp = arr[i];
			arr[i] = arr[smallest];
			arr[smallest] = temp;
		}
	}
	
	// Print the sorted array inside the method (or return it)
	System.out.println("Sorted Array: " + Arrays.toString(arr));
}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Enter " + size + " elements: ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
	
		selectionSort(arr);
		sc.close();
	}
}
