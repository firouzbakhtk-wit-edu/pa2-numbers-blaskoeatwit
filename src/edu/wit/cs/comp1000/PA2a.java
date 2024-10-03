package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA2a {

	// TODO: document this function
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int posCount = 0;
		int negCount = 0;
		int bigCount = 5;
		int posSum = 0;
		int negSum = 0;
		int bigSum = 0;
		double posAvg = 0;
		double negAvg = 0;
		double bigAvg = 0;

		System.out.print("Enter five whole numbers: ");
		for (int i = 0; i < 5; i++) {
			int curInt = input.nextInt();
			bigSum += curInt;
			if (curInt > 0) {
				posCount += 1;
				posSum += curInt;
			} else {
				negCount += 1;
				negSum += curInt;
			}
		}

		if (posCount > 0) {
			posAvg = (double) posSum / posCount;
		}
		if (posCount == 1) {
			System.out.println("The sum of the 1 positive number: " + posSum);
		} else {
			System.out.println("The sum of the " + posCount + " positive numbers: " + posSum);
		}

		if (negCount > 0) {
			negAvg = (double) negSum / negCount;
		}
		if (negCount == 1) {
			System.out.println("The sum of the 1 non-positive number: " + negSum);
		} else {
			System.out.println("The sum of the " + negCount + " non-positive numbers: " + negSum);
		}

		System.out.println("The sum of the 5 numbers: " + bigSum);

		if (bigSum != 0) {
			bigAvg = (double) bigSum / bigCount;
		}

		if (posCount == 1) {
			System.out.printf("The average of the 1 positive number: %.2f%n", posAvg);
		} else {
			System.out.printf("The average of the " + posCount + " positive numbers: %.2f%n", posAvg);
		}

		if (negCount == 1) {
			System.out.printf("The average of the 1 non-positive number: %.2f%n", negAvg);
		} else {
			System.out.printf("The average of the " + negCount + " non-positive numbers: %.2f%n", negAvg);
		}

		System.out.printf("The average of the 5 numbers: %.2f%n", bigAvg);
	}


}
