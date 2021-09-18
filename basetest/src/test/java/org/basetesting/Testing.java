package org.basetesting;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.Urls;

import basetest.Base;

public class Testing extends Base {
	public static void main(String[] args) {
		launchBrowser();
		openUrl("https://www.facebook.com/");
		// navto("https://www.facebook.com/");
		// navback();
		// navfwd();
		// navrefresh();
		// max();

		WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("tauhidaalam27");
		enable(username);

		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("TAUHID27");
		enable(password);

		WebElement logbut = driver.findElement(By.name("login"));
		press(logbut);
		title();
		currentUrl();

		WebElement cop = driver.findElement(By.xpath("//div[@class='_9axz']"));
		text(cop);

		WebElement forpwd = driver.findElement(By.xpath("//body[@dir='ltr']"));
		movelement(forpwd);
		press(forpwd);
		System.out.println("passed");

	}

}
