package org.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Thread.sleep(3000);

		driver.get("http://adactinhotelapp.com/");
		
		driver.navigate().to("https://www.youtube.com/watch?v=eyM-nQu6eFc&list=PLLS0D9-W-1dkYyV5dDzmNUjC7AvKOfVon&index=4&t=761s");

		WebElement username = driver.findElement(By.name("username"));

		username.sendKeys("TAUHIDAALAM27");

		WebElement password = driver.findElement(By.name("password"));

		password.sendKeys("AKTHARIT");

		WebElement cli = driver.findElement(By.name("login"));

		cli.click();

	


	}
}
