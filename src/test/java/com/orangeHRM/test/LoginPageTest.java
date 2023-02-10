/**
 * 
 */
package com.orangeHRM.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.orangeHRM.Pages.LoginPage;

/**
 * @author admin
 *
 */
public class LoginPageTest {
	
	@Test
	public void varifyLogoTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		
		
		LoginPage loginPage = new LoginPage(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		boolean flag=loginPage.validateLogo();
		loginPage.validateLogo();
		Assert.assertTrue(flag);
		
		
	}
	/*
	
	@Test
	public void varifyLoginTest() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32");
		WebDriver driver = new ChromeDriver();
		
		LoginPage loginPage = new LoginPage(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		loginPage.login();
		
		String actualURL=driver.getCurrentUrl();
		String expectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		Assert.assertEquals(actualURL, expectedURL);
		
		
		
	} */
	
	

}
