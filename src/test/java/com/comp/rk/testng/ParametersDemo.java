package com.comp.rk.testng;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParametersDemo {
	WebDriver driver;
	 
	@Parameters("browserName")
	 @BeforeTest
	 public void InitializeBrowser(@Optional("Edge") String browserName) {
		switch (browserName.toLowerCase()) {
		case "chrome":
					WebDriverManager.chromedriver().setup();
		 			driver=new ChromeDriver();
			break;
		case "firefox":
					WebDriverManager.firefoxdriver().setup();
		 			driver=new FirefoxDriver();
 			break;
		case "edge":
					WebDriverManager.edgedriver().setup();
		 			driver=new EdgeDriver();
 			break;

		default:System.err.println("Invalid BrowserName ");
			break;
		}
		 driver.manage().window().maximize();
	}
	@Parameters("sleeptime")
	 @AfterTest
	 public void TearDown(Long sleeptime) throws Exception {
		System.out.println(sleeptime);
		Thread.sleep(sleeptime);
		driver.quit();
	}
	 @Parameters("url")
	 @Test
	 public void launchApp(String url) {
		 driver.get(url);
	 }
	 @Parameters({"username" , "password"})
	 @Test
	 public void enterLoginDetails(String username,String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}
	 @Test
	 public void navigateMyInfo() {
		driver.findElement(By.id("menu_pim_viewMyDetails")).click();
	}
	 @Test
	 public void verifyMyDetails() {
		 boolean actualvalue=driver.findElement(By.xpath("//div[@id='employee-details']")).isDisplayed();
		 assertTrue(actualvalue);
	 }
	 @Test
	 public void verifyLoginDetails() {
		 WebElement element = driver.findElement(By.id("welcome"));
		 assertTrue(element.isDisplayed());
		 //System.out.println(element.isDisplayed());
		 assertTrue(element.getText().startsWith("Welcome"));
		 //System.out.println(element.getText());
	}
}
