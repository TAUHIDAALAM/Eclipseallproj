package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homedot_roll {

	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		
		Actions Mouse = new Actions(driver);
		
		WebElement Mobiles = driver.findElement(By.xpath("(//span[@class='catText'])[2]"));
		Mouse.moveToElement(Mobiles).build().perform();
		
		WebElement Panasonic = driver.findElement(By.xpath("(//span[@class='linkTest'])[58]"));
		Mouse.click(Panasonic).build().perform();
		
		
		
		
}

}
