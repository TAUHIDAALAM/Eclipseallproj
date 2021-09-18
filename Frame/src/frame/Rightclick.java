package frame;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
	
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
	
		Actions Mouse= new Actions(driver);
		Robot Kb = new Robot();

				
//BestSeller
		
		WebElement Bestseller = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		Mouse.moveToElement(Bestseller).build().perform();
		Mouse.contextClick(Bestseller).build().perform();
		
		Kb.keyPress(KeyEvent.VK_DOWN);
		Kb.keyRelease(KeyEvent.VK_DOWN);
		
		Kb.keyPress(KeyEvent.VK_ENTER);
		Kb.keyRelease(KeyEvent.VK_ENTER);
		
		
//MoBiles
		
		WebElement Mobiles = driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]"));
		Mouse.moveToElement(Mobiles).build().perform();
		Mouse.contextClick(Mobiles).build().perform();
		
		Kb.keyPress(KeyEvent.VK_DOWN);
		Kb.keyRelease(KeyEvent.VK_DOWN);
			
		
		Kb.keyPress(KeyEvent.VK_ENTER);
		Kb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		//String Parent = driver.getWindowHandle();
		//System.out.println("Parent id is :" + Parent);
		
		Set<String> All = driver.getWindowHandles();
		System.out.println(" All id is :" +  All);
		
		for (String Id : All) {
			System.out.println(Id);
			
			String title = driver.switchTo().window(Id).getTitle();
			System.out.println(title);
			
		}
		String shake="Amazon.in Bestsellers: The most popular items on Amazon\r\n";

			for (String Id : All) {
				if(driver.switchTo().window(Id).getTitle().equals(shake))
						
						{
					
					break;
				
				}
				
				Thread.sleep(5000);
				driver.close();
				
			}
			
		}

}	
		

