package com.day12_practice_programs;

public class MethodReturnDataTypes 
{

	    // 1. BYTE (Small whole numbers: -128 to 127)
	    public byte updateByte(byte inputByte) {
	        System.out.println("1. Received Byte: " + inputByte);
	        return (byte) (inputByte + 5); 
	    }

	    // 2. SHORT (Medium whole numbers: -32,768 to 32,767)
	    public short updateShort(short inputShort) {
	        System.out.println("2. Received Short: " + inputShort);
	        return (short) (inputShort * 2);
	    }

	    // 3. INT (Standard whole numbers)
	    public int updateInt(int inputInt) {
	        System.out.println("3. Received Int: " + inputInt);
	        return inputInt + 1000;
	    }

	    // 4. LONG (Huge whole numbers: For currency, population, world metrics)
	    public long updateLong(long inputLong) {
	        System.out.println("4. Received Long: " + inputLong);
	        return inputLong + 5000000L; // 'L' means long literal
	    }

	    // 5. FLOAT (Small decimal numbers)
	    public float updateFloat(float inputFloat) {
	        System.out.println("5. Received Float: " + inputFloat);
	        return inputFloat + 2.5f; // 'f' means float literal
	    }

	    // 6. DOUBLE (Precise decimal numbers - Best for calculations & currency)
	    public double updateDouble(double inputDouble) {
	        System.out.println("6. Received Double: " + inputDouble);
	        return inputDouble * 1.18; // Multiplies by 1.18 (e.g., adding 18% GST tax)
	    }

	    // 7. CHAR (Single character inside single quotes '')
	    public char nextAlphabet(char currentLetter) {
	        System.out.println("7. Received Char: " + currentLetter);
	        return (char) (currentLetter + 1); // Moves to the next letter in the alphabet
	    }

	    // 8. BOOLEAN (True or False)
	    public boolean toggleStatus(boolean currentStatus) {
	        System.out.println("8. Received Boolean: " + currentStatus);
	        return !currentStatus; // '!' means NOT (turns true to false, or false to true)
	    }

	    // 9. STRING (Text inside double quotes "")
	    public String introduceUser(String firstName, String city) {
	        System.out.println("9. Received Strings: " + firstName + " from " + city);
	        return "Welcome, " + firstName + " from " + city + "!";
	    }

	    // MAIN METHOD TO RUN EVERYTHING
	    public static void main(String[] args) {
	        MethodReturnDataTypes machine = new MethodReturnDataTypes();
	        System.out.println("=== STARTING THE ALL-DATA-TYPES TEST ===\n");

	        // 1. Test Byte
	        byte finalByte = machine.updateByte((byte) 10);
	        System.out.println("   Returned Byte: " + finalByte + "\n");

	        // 2. Test Short
	        short finalShort = machine.updateShort((short) 500);
	        System.out.println("   Returned Short: " + finalShort + "\n");

	        // 3. Test Int
	        int finalInt = machine.updateInt(45000);
	        System.out.println("   Returned Int: " + finalInt + "\n");

	        // 4. Test Long
	        long finalLong = machine.updateLong(9876543210L);
	        System.out.println("   Returned Long: " + finalLong + "\n");

	        // 5. Test Float
	        float finalFloat = machine.updateFloat(10.5f);
	        System.out.println("   Returned Float: " + finalFloat + "\n");

	        // 6. Test Double
	        double finalDouble = machine.updateDouble(1500.50);
	        System.out.println("   Returned Double: " + finalDouble + "\n");

	        // 7. Test Char
	        char finalChar = machine.nextAlphabet('A');
	        System.out.println("   Returned Char: " + finalChar + "\n");

	        // 8. Test Boolean
	        boolean finalBool = machine.toggleStatus(true);
	        System.out.println("   Returned Boolean: " + finalBool + "\n");

	        // 9. Test String
	        String finalString = machine.introduceUser("Amit", "Pune");
	        System.out.println("   Returned String: " + finalString + "\n");
	        
	        System.out.println("=== ALL TESTS PASSED SUCCESSFULLY ===");
	    }
	}


