package com.day18_practice_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Missing_Number_268 
{
    public void moveZeroes(int[] arr) 
    {
        int n = arr.length;
        int start = 0, end = n - 1;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) 
        {
            if (arr[i] != 0) 
            {
                ans[start++] = arr[i];
            } else 
            {
                ans[end--] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) 
        {
            arr[i] = ans[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) 
    {
        Missing_Number_268 obj = new Missing_Number_268();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) 
        {
            arr[i] = sc.nextInt();
        }

        obj.moveZeroes(arr);
        sc.close();
    }
}