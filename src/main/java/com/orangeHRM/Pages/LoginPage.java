package com.orangeHRM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By username = By.name("username");
	By password = By.name("password");
	By loginlogo = By.xpath("//img[@alt='company-branding']");
	By LoginButton = By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	

	public boolean validateLogo() {
		driver.findElement(loginlogo).isDisplayed();
		return true;
	}
	
	public void login() {
		driver.findElement(username).sendKeys("Admin");
		driver.findElement(password).sendKeys("admin123");
		driver.findElement(LoginButton).click();
		
		
	}
	
	
}
