package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_rollover {
	
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Actions Mouse = new Actions(driver);
		
		WebElement Home = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		Mouse.moveToElement(Home).build().perform();
		
		WebElement Start = driver.findElement(By.xpath("(//a[@class='nav-a'])[1]"));
		Mouse.click(Start).build().perform();
		
		WebElement Yourname = driver.findElement(By.name("customerName"));
		Yourname.sendKeys("Shake Mohammad");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("8148415367");
		
		WebElement Email = driver.findElement(By.id("ap_email"));
		Email.sendKeys("tauhidaalam27@gmail.com");
		
		
		WebElement Password = driver.findElement(By.id("ap_password"));
		Password.sendKeys("AKTHARIT");
		
		WebElement Login = driver.findElement(By.id("continue"));
		Login.click();
		
		
		
		

}
}