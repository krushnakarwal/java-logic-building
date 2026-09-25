// Take an integer using sc.nextInt(), then immediately take a String using
// sc.nextLine(). Fix the skipping issue by adding an extra sc.nextLine()
// to clear the scanner buffer.



package com.day4_practice_programs;

import java.util.Scanner;

public class ScannerBufferClear 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter your Roll Number: ");
		int rollNo = sc.nextInt();
		
		sc.nextLine(); 
		
		System.out.println("Enter your Department Name: ");
		String deptName = sc.nextLine();
		
		System.out.println("Roll Number : " + rollNo);
		System.out.println("Department  : " + deptName);
		
		sc.close();
	}
}

