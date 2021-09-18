package org.emp;

public class Employee {

	public void empId() {
		System.out.println("Employee id is 123");

	}
	
	public void empName() {
		System.out.println("Employee name is Abc");

	}

	public void empDob() {
		System.out.println("Employee Dob is 14Oct");

	}
	
	public void empPhone() {
	System.out.println("Employee Phone is 123456");

	}
	
	private void empAddress() {
		System.out.println("Employee adress is XYZ");
	}
	
		public static void main(String[] args) {
		
		 Employee a= new Employee(); 
	a.empId();
	a.empAddress();
	a.empDob();
	a.empPhone();
	a.empName();
	}
}
