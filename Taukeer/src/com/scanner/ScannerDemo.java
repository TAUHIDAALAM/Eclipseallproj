package com.scanner;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("input is ");
		int number = s.nextInt();
		System.out.println("output number is "+ number);
		
		System.out.println("old name is Ravi ");
		String Name = s.next();
		System.out.println("New name is " + Name);
		
		System.out.println("Enter a sentence");
		String Sentence = s.nextLine();
		System.out.println("New sentencqa1 is" + Sentence);
		
		
		}
	
	
}
