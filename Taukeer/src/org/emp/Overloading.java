package org.emp;

public class Overloading {

	public void empName(String name, int id) {
		System.out.println("Employee name is:" + name + id);
	}


	public void emp_FatherName(String Name) {
		System.out.println("Employee Father name is : " + Name);
		
	}
	
	private void empAge(int id) {
	System.out.println("Employee Age is:" + id);

	}
	
	public static void main(String[] args) {
		Overloading od = new Overloading();
		od.empAge(24);
		od.emp_FatherName("Hussain");
		od.empName("Taukeer", 1234);
	}
		
	}
