package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions Mouse = new Actions(driver);
		
		
WebElement Bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));

WebElement Debt_Account = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));

Mouse.dragAndDrop(Bank, Debt_Account).build().perform();

Thread.sleep(5000);

WebElement Debt = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));

WebElement Amount = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));


Mouse.dragAndDrop(Debt, Amount).build().perform();


			
		
		
		
		
		
		
		
}
}
