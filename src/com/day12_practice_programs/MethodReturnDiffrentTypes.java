package com.day12_practice_programs;

public class MethodReturnDiffrentTypes 
{
	    // TYPE 1: No Parameter, No Return Type
	    // (Brackets are empty, uses 'void')
	    public void showNotification() {
	        System.out.println("Type 1: Alert: Battery Low!");
	    }

	    // TYPE 2: With Parameter, No Return Type
	    // (Takes 'name' as input, uses 'void')
	    public void printName(String name) {
	        System.out.println("Type 2: Hello, " + name);
	    }

	    // TYPE 3: No Parameter, With Return Type
	    // (Brackets are empty, returns an integer 'int')
	    public int getLuckyNumber() {
	        return 7; // Sends 7 back
	    }

	    // TYPE 4: With Parameter, With Return Type
	    // (Takes two integers as input, returns their sum)
	    public int addNumbers(int a, int b) {
	        int sum = a + b;
	        return sum; // Sends the calculated sum back
	    }

	    // MAIN METHOD: Program starts running from here
	    public static void main(String[] args) {
	        
	        // Creating the object to call our methods
	        MethodReturnDiffrentTypes machine = new MethodReturnDiffrentTypes();
	        System.out.println("=== STARTING THE METHODS DEMO PROGRAM ===\n");

	        // 1. Executing Type 1
	        machine.showNotification();
	        System.out.println();

	        // 2. Executing Type 2 (Passing "Bhai" as an argument)
	        machine.printName("Bhai");
	        System.out.println();

	        // 3. Executing Type 3 (Catching the returned value in a variable)
	        int myLuckyNum = machine.getLuckyNumber();
	        System.out.println("Type 3: Received Return Value: " + myLuckyNum);
	        System.out.println();

	        // 4. Executing Type 4 (Passing 10 and 20, catching the final answer)
	        int totalAnswer = machine.addNumbers(10, 20);
	        System.out.println("Type 4: Received Final Calculated Output: " + totalAnswer);
	        System.out.println();

	        System.out.println("=== PROGRAM EXECUTED SUCCESSFULLY ===");
	    }
	}

