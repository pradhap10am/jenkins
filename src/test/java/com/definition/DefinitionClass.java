package com.definition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionClass {
	public static WebDriver driver;

	
	
	
	
@Given("user is on facebook login page")
public void user_is_on_facebook_login_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\"
			+ "Pradap\\driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	
	
   
}


@When("use enters the {string}  and {string}")
public void use_enters_the_and(String s1, String s2) {
	WebElement e1 = driver.findElement(By.id("email"));
	e1.sendKeys(s1);
	WebElement e2 = driver.findElement(By.id("pass"));
	e2.sendKeys(s2);
}



@Then("user click login button")
public void user_click_login_button() {
    WebElement e3 = driver.findElement(By.xpath("//input[@value='Log In']"));
    e3.click();
}

@When("user enter the first name")
public void user_enter_the_first_name() {
   WebElement e4 = driver.findElement(By.id("u_0_m"));
   e4.sendKeys("great");
}

@Then("user click sign up button")
public void user_click_sign_up_button() {
   WebElement e5 = driver.findElement(By.id("u_0_13"));
   e5.click();
}
	
	
		

}
