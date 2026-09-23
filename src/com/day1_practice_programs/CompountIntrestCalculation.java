package com.day1_practice_programs;
import java.util.Scanner;
public class CompountIntrestCalculation 
{
	public static void main (String[] args) 
	{
	       
	    Scanner sc = new Scanner(System.in);
	      
	    System.out.println("Enter a Principle Amount :");
	    double Principle_Amount = sc.nextDouble();
	    
	    System.out.println("Enter a Annual Intrest :");
	    double Anuual_Intrest = sc.nextDouble();
	    
	    System.out.println("Enter a Number of Year :");
	    int t = sc.nextInt();
	    
	    System.out.println("Enter a Number of Times :");
	    int n = sc.nextInt();

	    double A = Principle_Amount * Math.pow(( 1 + Anuual_Intrest / n),(n * t));
	    double Compount_Intrest = A - Principle_Amount;

	    System.out.printf("%.2f\n",Compount_Intrest);

	    sc.close();
	}
}
	    
	    


