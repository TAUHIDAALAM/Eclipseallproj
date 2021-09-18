package com.annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annot {

	@Test
	public void testCase1() {
		// selenium code to composemail
		System.out.println("Composemail");

	}

	@Test
	public void testCase2() {
		// selenium code to savemail
		System.out.println("savemail");

	}

	@BeforeMethod
	public void bmethod() {
		System.out.println("OpenBrowser,url,Login");
	}

	@AfterMethod
	public void amethod() {
		System.out.println("Logout,CloseBrowser");
	}

	@AfterClass
	public void aclass() {
		System.out.println("Shutdown server...");
	}

	@BeforeClass
	public void bclass() {
		System.out.println("Start server...");
	}

}
