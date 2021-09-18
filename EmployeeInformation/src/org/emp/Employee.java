package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	private void empName() {
		System.out.println("Employee name is : Shake Mohammad");
	}
	
	public static void main(String[] args) {
		Employee empname = new Employee();
		Company compname = new Company();
		Client clientname= new Client();
		Project projname = new Project();
		
		
		empname.empName();
		compname.companyName();
		clientname.clientName();
		projname.projectName();
	
	}

}
