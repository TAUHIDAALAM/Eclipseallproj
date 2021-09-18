package org.proj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project {

	public static void main(String[] args) {
		
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Program Files\\software\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        
        WebElement cli = driver.findElement(By.xpath("//a[text()='Mobiles']"));
        cli.click();
        
        WebElement shop = driver.findElement(By.xpath("(//a[text()='Shop now'][1])"));
        shop.click();
        
	}}