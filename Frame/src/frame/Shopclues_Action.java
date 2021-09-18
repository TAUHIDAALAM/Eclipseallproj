package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Shopclues_Action {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
	
		Actions Mouse = new Actions(driver);
		
		WebElement Courses = driver.findElement(By.xpath("//a[@class='activeLink']"));
		Mouse.moveToElement(Courses).build().perform();
		
		WebElement Software = driver.findElement(By.xpath("//a[@href='http://www.greenstechnologys.com/software-testing.html']"));
		Mouse.moveToElement(Software).build().perform();
		
		WebElement Selenium = driver.findElement(By.xpath("(//a[@href='http://www.greenstechnologys.com/selenium-course-content.html'])[1]"));
		Mouse.moveToElement(Selenium).build().perform();
		Mouse.click(Selenium).build().perform();
		
		
	String str =  driver.getTitle();
	System.out.println("\n The title is:  " + str);

	String abc = driver.getCurrentUrl();
	System.out.println("The Current url is \n" + abc);

	
		
	
		
		
		
		
		
		
		
		
}

}