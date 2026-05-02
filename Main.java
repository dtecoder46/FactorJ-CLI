/**
 * This program allows users to enter a number and get the corresponding factors
 *
 * @author Daniel_Te
 * @version v1.0 4/17/26
 */

import java.util.Scanner;
import java.util.ArrayList;

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
			return;
        }

		int chosenAbsolute = Math.abs(chosenInput);

		ArrayList<Integer> factors = factorize(chosenAbsolute);

		System.out.print(factors);


	}

	/** 
	 * A recursive method to determine the factors of a number
	 * @param number - the number of which to determine factors
	 * @return factorList - a list of two factors
	 * 
	 * Source: Gemini
	 * 
	 * Prompt: 
	 * "Whenever I run this Java file, 
	 * the terminal freezes up and the program keeps running. 
	 * Can you identify the issues with this Java code?"
	 * 
	 * Link: https://gemini.google.com/share/6936111e6705
	 */

	public static ArrayList<Integer> factorize(int number) {
		ArrayList<Integer> factorList = new ArrayList<Integer>();

		// Base Case: if number is 1, return a list with 1
		if (number <= 1) {
			factorList.add(1);
			return factorList;
		}

		// Check for the smallest prime factor
		int divisor = -1;
		if (number % 2 == 0) divisor = 2;
		else if (number % 3 == 0) divisor = 3;
		else if (number % 5 == 0) divisor = 5;
		else if (number % 7 == 0) divisor = 7;

		if (divisor != -1) {
			factorList.add(divisor);
			// Combine this factor with the factors of the remaining number
			factorList.addAll(factorize(number / divisor));
		} else {
			// It's a prime > 7
			factorList.add(number);
			factorList.add(1);
		}
		
		return factorList;

	}

	/**
	 * A method to condense the number of factors to 2
	 * 
	 * @param factors - the extended list of factors
	 * @return factorsCondensed - the condensed list of factors
	 */

	public static ArrayList<Integer> condense(ArrayList<Integer> factors) {
		// Define initial variables
		int length = factors.size();
		double middleIndex = length / 2.0;
		int productOfLeft = 1;
		int productOfRight = 1;
		int index = 0;

		// separate the list of factors using the middle index

		while (index < length) {
			if (index < middleIndex) {
				productOfLeft *= factors.get(index);
			}
			else {
				productOfRight *= factors.get(index);
			}

			index++;
		}

		// return a list containing productOfLeft and productOfRight
		ArrayList<Integer> factorsCondensed = new ArrayList<Integer>();

		factorsCondensed.add(productOfLeft);
		factorsCondensed.add(productOfRight);

		return factorsCondensed;
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

