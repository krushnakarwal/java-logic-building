package com.logic_practice_programs;

import java.util.*;

public class Greet_Massage_BaseInGender 
{
    public static String solve(char gen) 
    {
        if (gen == 'M' || gen == 'm') 
        {
            return "Hello, Sir!";
        } 
        else if (gen == 'F' || gen == 'f') 
        {
            return "Hello, Ma'am!";
        } 
        else 
        {
            return "Hello, Guest!";
        }
    }

    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        char gen = sc.next().charAt(0);
        
        System.out.println(Greet_Massage_BaseInGender.solve(gen));

        sc.close();
    }
}
