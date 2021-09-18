package org.test;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {

		int number = 100, sum = 0;

		for (int i = 0; i <= number; i++) {

			if (i % 2 == 0) {

				sum = sum + i;

			}

		}
		System.out.println(sum);

	}

}

/*
 * CONDITIONAL STATEMENT PROGRAM
 * 
 * Scanner S = new Scanner(System.in); System.out.println("Enter the number");
 * int number = S.nextInt(); System.out.println(number);
 * 
 * if (number % 2 == 0) { System.out.println("It is even number"); }
 * 
 * else {
 * 
 * System.out.println("It is odd number");
 * 
 * } } }
 */

/*-----------
Description: Write a program to find even or odd number

Example:
---------
Input  = 10
Output = Even*/

/*
 * CONDITIONAL STATEMENT PROGRAM
 * 
 * Scanner S = new Scanner(System.in); System.out.println("Enter Your Age"); int
 * Age = S.nextInt(); System.out.println(Age);
 * 
 * if (Age > 18) {
 * 
 * System.out.println("Eligible to Vote"); }
 * 
 * else
 * 
 * { System.out.println("Not eligible"); }
 * 
 * }
 * 
 * }
 * 
 * QUESTION 1: ----------- Description: Write Java program to allow the user to
 * input his/her age. Then the program will show if the person is eligible to
 * vote. A person who is eligible to vote must be older than or equal 1 to 18
 * years old. Example: -------- Input = 10 Output = print not eligible.
 */
