package com.array;

import java.util.Iterator;

public class ArrayDemo {

	int a = 10;
	
	public static void main(String[] args) {
		int[] a = new int[7];
		
		a[0]= 10;
		a[1]=20;
		a[2]=40;
		a[3]=80;
		a[4]=110;
		a[5]= 120;
		a[6]=130;
		
		
				System.out.println(a[6]);
				
				for (int i = 0; i < a.length; i++) {
					
					System.out.println(a[i]);
				}
		
				
	}
			
			
}
