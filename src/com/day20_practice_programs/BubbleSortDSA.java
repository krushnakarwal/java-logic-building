package com.day20_practice_programs;
import java.util.*;
import java.util.Arrays;
public class BubbleSortDSA 
{
	public void  bubbleSort(int[] arr)
	{
		for(int i = 0;i<arr.length-1;i++)
		{
			for(int j = 0;j <arr.length - i - 1 ;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	};
	
	public static void main(String [] args)
	{
		BubbleSortDSA obj = new BubbleSortDSA();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size of elements : ");
		int size = sc.nextInt();
		
		int []arr = new int[size];
		
		System.out.println("Elements are : ");
		for(int i = 0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		obj.bubbleSort(arr);
		sc.close();
	}

}
