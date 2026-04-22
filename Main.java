/**
 * This program allows users to enter a number and get the corresponding factors
 *
 * @author Daniel_Te
 * @version v1.0 4/17/26
 */

import java.util.Scanner;

public class Main {
	/**
	 * The main method to ask for integer input and run the program
	 *
	 * @param args
	 * @return none
	 */

	public static void main(String[] args) {
		// Global scope
		
		Scanner input = new Scanner(System.in);
		int chosenInput = 0;

        try {
			print("Enter an integer (do not enter decimals, negative numbers will be turned positive via absolute value): ");
            chosenInput = input.nextInt();
            input.nextLine();
        }
        
		catch(Exception e) {
			print("Invalid input, do not enter decimals");
        }

		int chosenAbsolute = Math.abs(chosenInput);

		int[] factors = factorize(chosenAbsolute);

		print("Factors: " + factors[0] + ", " + factors[1]);	
	}

	/** 
	 * A recursive method to determine the factors of a number
	 * @param number - the number of which to determine factors
	 * @return factorList - a list of two factors
	 */

	public static int[] factorize(int number) {
		int[] factorList = new int[20];

		// Base case: the chosen integer is a prime number
		factorList[0] = 1;
		factorList[1] = number;

		return factorList;
	}

	/**
	 * An alias method to make printing easier
	 * @param text - the string to print
	 * @return none
	 */

	public static void print(String text) {
		System.out.println(text);
	}
}

