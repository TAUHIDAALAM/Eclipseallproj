package org.overriding;

public class Overrding {

	public void homeLoan() {
		System.out.println("Home loan is 12K");

	}
	
	public void goldLoan() {
		System.out.println("Gold loan is 15k");

	}
	public void carLoan() {
		System.out.println("car loan is 20k");

	}
	public void personalloan() {
	System.out.println("Personal Loan is 25k");

	}
	 
	public static void main(String[] args) {
		Overrding o= new Overrding();
		o.carLoan();
	o.goldLoan();
	o.homeLoan();
	o.personalloan();
	}
}
