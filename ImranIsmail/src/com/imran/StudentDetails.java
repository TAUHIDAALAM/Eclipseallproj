package com.imran;

public class StudentDetails {

	public void stdName() {
		
		String name;
		
		name= "imran";
		
		System.out.println("Studentname is " );
	}
	
	private void stdId() {
		System.out.println("stud id is 123");
		
	}
	public void loan() {
	System.out.println("15");	
		
	}
	
	public static void main(String[] args) {
		// className Refname = new Classname
		StudentDetails sd = new StudentDetails();
		//sd.stdId();
		sd.stdName();
		//sd.loan();
		
	}
}
