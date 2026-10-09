package com.day14_practice_programs;
import java.util.*;
public class CheckIfArrayIsSorted 
{
		public static void main(String [] krish)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of array : ");
			int size = sc.nextInt();
			int arr[] = new int[size];
			boolean isSorted = true;
			System.out.println("Enter " + size + " elements : ");
			for(int i = 0;i<arr.length;i++)
			{
				arr[i] = sc.nextInt();
			}
			
			for(int i = 0;i<arr.length-1;i++)
			{
				if(arr[i] > arr[i+1])
				{
					isSorted = false;
			        break;
				}
			}
			
			System.out.println(isSorted);
			sc.close();
			
		}

	}
