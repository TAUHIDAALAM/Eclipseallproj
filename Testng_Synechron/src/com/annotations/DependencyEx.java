package com.annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DependencyEx {

	@Test(priority=1)
	public void login(){
		//selenium code to Login
		SoftAssert st=new SoftAssert();
		st.assertEquals(true, true);
		System.out.println("Login");
		st.assertAll();
	}
	@Test(priority=3,dependsOnMethods={"login"})
	public void composemail(){
		SoftAssert st=new SoftAssert();
		st.assertEquals(true, false);
		//selenium code to composemail
		System.out.println("Composemail");
		st.assertAll();
	}
	@Test(priority=2,dependsOnMethods={"login","composemail"})
	public void Savemail(){
		//selenium code to Savemail
		System.out.println("Savemail");
	}

}
