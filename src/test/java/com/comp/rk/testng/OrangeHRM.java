package com.comp.rk.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {
 WebDriver driver;
 
 @BeforeTest
 public void InitializeBrowser() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
}
 @AfterTest
 public void TearDown() {
	driver.quit();
}
 @Test
 public void launchApp() {
	 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
 }
 @Test
 public void enterLoginDetails() {
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
}
 @Test
 public void navigateMyInfo() {
	driver.findElement(By.id("menu_pim_viewMyDetails")).click();
}
 @Test
 public void verifyMyDetails() {
	System.out.println(driver.findElement(By.xpath("//div[@id='employee-details']")).isDisplayed());
}
 @Test
 public void verifyLoginDetails() {
	 WebElement element=driver.findElement(By.id("welcome"));
	 System.out.println(element.isDisplayed());
	System.out.println(element.getText());
}
}
