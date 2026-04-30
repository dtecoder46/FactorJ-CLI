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
        }

		int chosenAbsolute = Math.abs(chosenInput);

		ArrayList<Integer> factors = factorize(chosenAbsolute);

		System.out.print(factors);	
	}

	/** 
	 * A recursive method to determine the factors of a number
	 * @param number - the number of which to determine factors
	 * @return factorList - a list of two factors
	 */

	public static ArrayList<Integer> factorize(int number) {
		ArrayList<Integer> factorList = new ArrayList<Integer>();

		if (number % 2 == 0) { // General case 1: even number
			factorList.add(2);

			int newNumber = number/2;
			factorize(newNumber);
		}

		else if (number == 1) {
			factorList = condense(factorList);
		}

		else {
			// Base case: the chosen integer is a prime number, return itself and 1
			factorList.add(1);
			factorList.add(number);
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

