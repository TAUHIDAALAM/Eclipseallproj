package org.emp;

public class Employee {
	
	private void empId() {
    System.out.println("Employee iD is 12345");
	}
	private void empName() {
	System.out.println("Employee Name is Shake Mohammad");
	}
	private void empDob() {
	System.out.println("Employee DOB is 27May1993");
	}
	private void empPhone() {
	System.out.println("Employee Phone number is  is 123456789");  
	}
	private void empEmail() {
	System.out.println("Employee Email is tauhidaalam27@gmail.com");
	}
	private void empAddress() {
	System.out.println("Employee Address is ABCD");

	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.empId();
		emp.empName();
		emp.empDob();
		emp.empPhone();
		emp.empEmail();
		emp.empAddress();
	}
	

}


