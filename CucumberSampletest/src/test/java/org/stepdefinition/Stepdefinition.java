package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdefinition {

	WebDriver driver;

	@Given("User is on login page")
	public void user_is_on_login_page() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

	}

	@When("To input correct name and password")
	public void to_input_correct_and(String email , String pass) {

		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);

	}

	@Then("click on login")
	public void click_on_login() {
		driver.findElement(By.name("login")).click();
		
		
	}

}
