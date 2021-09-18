package org.abstraction;

public class Abstrction extends Abstraction{

	@Override
	public void goldloan() {
		System.out.println("Gold loan is 25");
		
	}
	
	@Override
	public void bike() {
			System.out.println("65");	
	}


	
	
	
	public static void main(String[] args) {
		Abstrction a= new Abstrction();
		a.carLoan();
		a.goldloan();
		a.homeLoan();
		a.bike();
	}

	
}
