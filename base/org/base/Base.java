package org.base;

public class Base {
	
	public static WebDriver driver;

	// 1. launch browser:

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	}

	// 2. open url:

	public static void openUrl(String url) {
		driver.get(url);
	}

	// 3. Navigate to:

	public static void navto(String url) {
		driver.navigate().to(url);
	}

	// 4. navfwd:

	public static void navfwd() {
		driver.navigate().forward();

	}

	// 5. navback:

	public static void navback() {
		driver.navigate().back();
	}

	// 6. navrefresh:

	public static void navrefresh() {
		driver.navigate().refresh();
	}

	// 7. Close:

	public static void singleclose() {
		driver.close();
	}

	// 8. Allclose

	public static void allClose() {
		driver.quit();
	}

	// 9. Input
	public static void typeText(WebElement element, String data) {
		element.sendKeys(data);
	}

	// 10. Click

	public static void press(WebElement element) {
		element.click();

	}

	// 11. Gettitle

	public static void title() {
		String title = driver.getCurrentUrl();
		System.out.println(title);

	}

	// 12. getcurrent URL:

	public static void currentUrl() {
		String URL = driver.getCurrentUrl();
		System.out.println(URL);

	}

	// 13. gettext

	public static void text(WebElement element) {
		String name = element.getText();

	}
	
	// 14. Actions/moveelement
	
	public static void movelement(WebElement element) {
	Actions ac = new Actions(driver);
	ac.moveToElement(element).perform();

	}
	


}
