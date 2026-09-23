package com.day1_practice_programs;
import java.util.*;
public class AreaAndPerimeterOfRectangle 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        
		System.out.println("Enter a length :");
		int length = sc.nextInt();
		
		System.out.println("Enter a width :");
		int width = sc.nextInt();
        
		int area = length * width;
		int perimeter = 2*(length + width);

		System.out.println("Area of Rectangle : "+area);
		System.out.println("perimeter of rectangle : "+perimeter);

		sc.close();
     }

}

