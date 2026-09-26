package com.day9_practice_programs;
import java.util.*;
public class GuessTheNumberGame 
{
	public static void main(String [] args)
	{
	    Scanner sc = new Scanner(System.in);
	        
	    int randomNumber = (int) (Math.random() * 100) + 1;
	    int guessNumber = 0;

	    do{
	         System.out.println("Guess the number between 1 - 100");
	         guessNumber = sc.nextInt();

	         if(guessNumber < randomNumber)
	         {
	             System.out.println("Too Less, Guess The Higher Number ");
	         }
	         else if (guessNumber > randomNumber)
	         {
	             System.out.println("Too High, Guess The Lesses Number ");
	         }
	         else
	         {
	             System.out.println("Congratulation, you win the game!!");
	         }

	        }while (guessNumber != randomNumber);

	        sc.close();
	   }
}

