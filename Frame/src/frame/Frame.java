package frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
driver.manage().window().maximize();

WebElement Box = driver.findElement(By.xpath("/html/frameset/frameset/frame[1]"));
driver.switchTo().frame(0);


WebElement Login = driver.findElement(By.name("fldLoginUserId"));
Login.sendKeys("42261262");

WebElement Continue = driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[6]/td[2]/a/img"));
Continue.click();

driver.switchTo().parentFrame();


	
	

		
		
		

	}

}
