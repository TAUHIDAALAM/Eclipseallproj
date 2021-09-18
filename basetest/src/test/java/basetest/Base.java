package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver driver;
	public static Actions ac;

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
		String title = driver.getTitle();
		System.out.println(title);

	}

	// 12. getcurrent URL:

	public static void currentUrl() {
		String URLS = driver.getCurrentUrl();
		System.out.println(URLS);

	}

	// 13. gettext

	public static void text(WebElement element) {
		String name = element.getText();
		System.out.println(name);

	}

	// 14. Actions/moveelement

	public static void movelement(WebElement element) {
		ac = new Actions(driver);
		ac.moveToElement(element).perform();

	}

	// 15. maximize

	public static void max() {
		driver.manage().window().maximize();
	}

	// 16. isEnables

	public static void enable(WebElement element) {
		boolean enab = element.isEnabled();
		System.out.println(enab);
	}

	// 17. isdisplayed
	public static void display(WebElement element) {
		boolean disp = element.isDisplayed();
		System.out.println(disp);

	}

	// 18. is select

	public static void sel(WebElement element) {
		boolean sele = element.isSelected();
		System.out.println(sele);

	}

}
