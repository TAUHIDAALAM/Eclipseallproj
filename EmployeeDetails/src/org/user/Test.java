package org.user;

import org.mobile.Employee;

public class Test implements Employee {

	private void empReg() {
		System.out.println("the reg is :");

	}

	private void empRoll() {
		System.out.println("the roll is :");
	}

	public static void main(String[] args) {

		Test t = new Test();
		t.empReg();
		t.empPh();
		t.empName();
		t.empRoll();
		t.empId();

	}

	@Override
	public void empPh() {
		System.out.println("the ph is : ");
		
	}

	public void empName() {
		System.out.println("name is");


	
	}

	@Override
	public void empId() {
	System.out.println("the id ");

}}


