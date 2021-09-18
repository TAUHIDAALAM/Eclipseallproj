package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample{

	@BeforeClass
	
	private void chromelaunch() {
		System.out.println("Browser launched");
	}

	@AfterClass
	
	private void Closebrowser() {
		System.out.println("Browser closed");

	}

	@BeforeMethod
	
	private void starttime() {
		System.out.println("startstime");
	}

	@AfterMethod
	
	private void endTime() {
		System.out.println("end time");
	}

	@Test

	private void tc1() {
		System.out.println("Test case 1");
	}

	@Test

	private void tc2() {
    System.out.println("Test case 2");

	}
}
