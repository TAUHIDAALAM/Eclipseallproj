package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_First {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gettyimages.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		Actions Mouse = new Actions(driver);
		
		WebElement Cli = driver.findElement(By.xpath("//a[@data-nav='nav_Editorial']"));
		Mouse.moveToElement(Cli).build().perform();
		Mouse.click(Cli).build().perform();
		
		WebElement Editorial = driver.findElement(By.xpath("(//a[@class='landing-secondary-menu__link landing-secondary-menu__link--unselected text-link--sly'])[3]"));
Mouse.moveToElement(Editorial).build().perform();
Mouse.click(Editorial).build().perform();





		
		
			
		
	}

}
