import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	// function to checkPalindrome

	public void checkPalindrome() {

		System.out.print("Enter the number: ");

		int initialNnumber = sc.nextInt();
		int temp = initialNnumber;
		int palindromeNumber = 0;

		while (temp != 0) {

			palindromeNumber = (palindromeNumber * 10) + (temp % 10);
			temp = temp / 10;

		}

		if (initialNnumber == palindromeNumber) {

			System.out.println("The entered number is a palindrome number.");

		} else {
			System.out.println("The entered number is not a palindrome number.");

		}

	}

	// function to printPattern

	public void printPattern() {

		System.out.print("Enter the input number: ");

		int inputNumber = sc.nextInt();

		System.out.println("The pattern: ");

		for (int i = inputNumber; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				System.out.print("x");

			}
			System.out.println("");
		}

	}

	// function to check no is prime or not

	public void checkPrimeNumber() {

		System.out.print("Enter the number: ");

		int number = sc.nextInt();
		int count = 0;

		if (number == 0 || number == 1) {
			System.out.println("The entered number is neither prime nor composite.");
		} else {
			for (int i = 1; i <= number / 2; i++) {

				if (number % i == 0) {
					count++;
				}

				if (count > 1) {

					System.out.println("The entered number is not a prime number.");
					break;
				} else
					continue;
			}

			if (count == 1) {
				System.out.println("The entered number is a prime number.");
			}
		}
	}

	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		// initialize the first and second value as 0,1 respectively.

		int first = 0, second = 1, result;

		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		System.out.print("The fibonacci series of " + number + " is: ");

		if (number == 1)
			System.out.println(first);
		else if (number == 2)
			System.out.println(first + "," + second);
		else {

			System.out.print(first + "," + second);

			for (int i = 2; i < number; i++) {

				System.out.print(",");
				result = first + second;
				System.out.print(result);

				first = second;
				second = result;
			}
		}

	}

	// main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("\nEnter your choice from below list.\n" + "1. Find palindrome of number.\n"

					+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

					+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;

			case 1: {

				obj.checkPalindrome();

			}

				break;

			case 2: {

				obj.printPattern();

			}

				break;

			case 3: {

				obj.checkPrimeNumber();

			}

				break;

			case 4: {

				obj.printFibonacciSeries();

			}

				break;

			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}