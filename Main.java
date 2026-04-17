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

		print("Enter an integer (no decimals or negative numbers): ");
		int chosenNumber = input.nextInt();
		input.nextLine();

		while(chosenNumber < 0) {
			print("Invalid input. Enter an integer (no decimals or negative numbers): ");
	                chosenNumber = input.nextInt();
        	        input.nextLine();
		}

		print("" + chosenNumber);	
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
