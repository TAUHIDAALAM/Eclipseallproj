package org.testing;

public class JavaTesting_Sample {
	
	public static void main(String[] args) {
		
		String s = "Shake Mohammad 27@";
		
		
		// 1. 
		char Character = s.charAt(8);
		System.out.println(Character);
		
		
		// 2. 
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		//3. 
		String lowercase = s.toLowerCase();
		System.out.println(lowercase);
		
		//4. 
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		// 5. 
		
		boolean startsWith = s.startsWith("Sha");
		System.out.println(startsWith);
		
		//6. 
		
		boolean endsWith = s.endsWith("27@");
		System.out.println(endsWith);
		
		//7.
		
		boolean contains = s.contains("Moh");
		System.out.println(contains);
		
		
		
		


		
	}

}

