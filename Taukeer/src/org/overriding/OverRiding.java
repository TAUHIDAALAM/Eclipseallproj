package org.overriding;

public class OverRiding extends Overrding {

	@Override
	public void goldLoan() {
		super.goldLoan();
		System.out.println("Gold loan is 10");
	}
	
	@Override
	public void homeLoan() {
		super.homeLoan();
		System.out.println("Home loan is 15");
	}
	
	@Override
	public void carLoan() {
		super.carLoan();
		System.out.println("Car loan is 20");
	}
	
	@Override
	public void personalloan() {
		super.personalloan();
		System.out.println("Personal loan is 25");
	}
	public static void main(String[] args) {
		OverRiding ov= new OverRiding();
		
		ov.carLoan();
		ov.goldLoan();
		ov.homeLoan();
		ov.personalloan();
	}
}
