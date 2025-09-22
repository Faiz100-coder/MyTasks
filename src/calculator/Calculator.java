

package calculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean run = true;

		while (run) {
			//System.out.println();
			System.out.println(" \n Choose an operation:");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			System.out.println("6. Exit");
			System.out.print("Enter your choice (1-6): ");
			int choice = sc.nextInt();

			if (choice == 6) {
				run = false;
				System.out.println("----------------------------------");

			} else if (choice >= 1 && choice <= 5) {
				System.out.print("First Number: ");
                double num1 = sc.nextDouble();
                System.out.print("Second Number: ");
                double num2 = sc.nextDouble();
				switch (choice) {

				case 1:
					System.out.println("\t RESULT : " + add(num1, num2));
					break;
				case 2:
					System.out.println("\t RESULT : " + sub(num1, num2));
					break;
				case 3:
					System.out.println("\t RESULT : " + mul(num1, num2));
					break;
				case 4:
					if (num2 != 0) {
						System.out.println("\tRESULT : " + div(num1, num2));
					} else {
						System.out.println("\t Number cannot divided by zero");
					}
					break;
				case 5:
					System.out.println("\t RESULT : " + mod(num1, num2));
					break;

				default: System.out.println("\t Invalid Choice .. ");
				}
			}
	}
	
	} 

	public static double add(double num1, double num2) {
		return num1 + num2;
	}

	public static double sub(double num1, double num2) {
		return num1 - num2;
	}

	public static double mul(double num1, double num2) {
		return num1 * num2;
	}

	public static double div(double num1, double num2) {
		return num1 / num2;
	}

	public static double mod(double num1, double num2) {
		return num1 % num2;

	}

}
