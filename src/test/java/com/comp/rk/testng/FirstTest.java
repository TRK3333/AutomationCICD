package com.comp.rk.testng;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {

	@Test
	public void testGoogle() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials",Keys.ENTER);
		String expectedresult="HYR Tutorials - Google Search";
		String actualresult=driver.getTitle();
		//Assert.assertEquals(actualresult, expectedresult);
		//we can direct use assert methods by import Asser Library
		assertEquals(actualresult, expectedresult);
		Thread.sleep(3000);
		driver.quit();
	}
	@Test
	public void testFacebook() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("HYR Tutorials",Keys.ENTER);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.quit();
	}
}