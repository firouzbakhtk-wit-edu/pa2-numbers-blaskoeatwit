package edu.wit.cs.comp1000;

import java.util.Scanner;

//Now passes tests
public class PA2b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a b c: ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double discriminant = Math.pow(b, 2) - 4 * a * c;
		if (discriminant < 0) {
			System.out.println("Roots: imaginary");
		}
		else if (discriminant == 0) {
			System.out.printf("Root: %.2f%n", -1 * b / (2 * a));
		}
		else if (discriminant > 0) {
			double min = Math.min(
					(-1 * b + Math.sqrt(discriminant)) / (2 * a),
					(-1 * b - Math.sqrt(discriminant)) / (2 * a)
			);
			double max = Math.max(
					(-1 * b + Math.sqrt(discriminant)) / (2 * a),
					(-1 * b - Math.sqrt(discriminant)) / (2 * a)
			);
			System.out.printf("Roots: %.2f, %.2f%n", min, max);
		}
	}

}
