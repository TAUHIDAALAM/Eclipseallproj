package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homedot_Rollover {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		
		Actions Mouse = new Actions(driver);
		
		WebElement Alldept = driver.findElement(By.xpath("(//a[@data-id='departmentsFlyout'])[1]"));
		Mouse.moveToElement(Alldept).build().perform();
		
		WebElement Heat = driver.findElement(By.xpath("(//a[@data-level='Heating & Cooling'])[1]"));
		Mouse.moveToElement(Heat).build().perform();
		
		WebElement Ac = driver.findElement(By.xpath("//a[@title='Air Conditioners']"));
        Mouse.moveToElement(Ac).build().perform();

WebElement PortableAC = driver.findElement(By.xpath("//a[@title='Portable Air Conditioners']"));
Mouse.click(PortableAC).build().perform();

driver.close();



		
		
		
}
}

