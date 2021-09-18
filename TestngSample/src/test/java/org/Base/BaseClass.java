package org.Base;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions ac;
	public static Robot rb;

	// 1. launch browser:

	public static void launchBrowser() {

		
		WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

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

	// 13. gettext:

	public static void copyText(WebElement element) {
		String name = element.getText();

	}

	// 14. Actions/moveelement:

	public static void movelement(WebElement element) {
		ac = new Actions(driver);
		ac.moveToElement(element).perform();

	}

	// 15. dragand drop:

	public static void dragDrop(WebElement src, WebElement dest) {
		ac = new Actions(driver);
		ac.dragAndDrop(src, dest).perform();

	}

	// 16. Double Click:

	public static void twoclick(WebElement element) {
		ac = new Actions(driver);
		ac.doubleClick(element).perform();
	}

	// 17. Contextclick:

	public static void rightClick(WebElement element) {
		ac = new Actions(driver);
		ac.contextClick(element).perform();
	}

	// 18. Maximize

	public static void maxbrowser() {
		driver.manage().window().maximize();

	}

	/*
	 * / 19. Robot_copy
	 * 
	 * public static void robotActioncopy() throws AWTException { rb = new Robot();
	 * 
	 * rb.keyPress(KeyEvent.VK_CONTROL); rb.keyPress(KeyEvent.VK_C);
	 * rb.keyRelease(KeyEvent.VK_CONTROL); rb.keyRelease(KeyEvent.VK_C);
	 * 
	 * 
	 * }
	 * 
	 * // 20. Robot_Paste
	 * 
	 * public static void robotActionpaste() {
	 * 
	 * rb.keyPress(KeyEvent.VK_CONTROL); rb.keyPress(KeyEvent.VK_V);
	 * rb.keyRelease(KeyEvent.VK_CONTROL); rb.keyRelease(KeyEvent.VK_V);
	 * 
	 * System.out.println(rb); }
	 */

	// 21. Attribute

	public static void attributevalueinput(WebElement element) {
		String value = element.getAttribute("value");
		System.out.println(value);
	}
	// 22. Implicit wait:

	public static void impwait(int value) {
		driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);

	}
}
