package com.TestCaseforAmazon;

public class Test1 {
	WebDriver driver;
	String Browser="chrome";
	@Test
	public void testCase1(){
		if(Browser.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();// openBrowser
		}else if(Browser.equalsIgnoreCase("ie")){
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}else if(Browser.equalsIgnoreCase("mozilla")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	
		driver.get("https://www.amazon.com/");//open browser
		driver.manage().window().maximize(); // maximize browser
		//Login
		
		
	}

	

}
