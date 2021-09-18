package org.testing;

public class Verify {

	public static void main(String[] args) {

		String S = new String("welcome");

		String replace1 = S.replace("e", "@");
		String replace2 = replace1.replace("o", "@");
		
		

		System.out.println(replace2);

	}

}
