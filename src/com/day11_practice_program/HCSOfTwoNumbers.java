package com.day11_practice_program;
import java.util.*;
public class HCSOfTwoNumbers 
{
	    public static void solve(String input) 
	    {
	        String[] parts = input.trim().split("\\s+");
	        
	        int n1 = Integer.parseInt(parts[0]);
	        int n2 = Integer.parseInt(parts[1]);

	        while (n1 != n2) 
	        {
	            if (n1 > n2) 
	            {
	                n1 = n1 - n2;
	            } else 
	            {
	                n2 = n2 - n1;
	            }
	        }
	        
	        System.out.println(n1);
	    }

	    public static void main(String [] args)
	    {
	        Scanner sc = new Scanner(System.in);

	        String input = sc.nextLine();

	        HCSOfTwoNumbers.solve(input);

	        sc.close();
	    }
	}

