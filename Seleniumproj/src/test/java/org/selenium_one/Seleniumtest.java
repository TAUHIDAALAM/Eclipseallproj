package org.selenium_one;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumtest {

	public static void main(String[] args) throws AWTException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement all = driver.findElement(By.name("field-keywords"));

		all.sendKeys("iphone");
		
		WebElement search = driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		

		WebElement conf = driver.findElement(By.xpath("(//span[@class='a-color-state a-text-bold'])[1]"));
		
		String text = conf.getText();
		
		System.out.println(text);
		
		

	}
}
