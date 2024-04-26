package com.comp.rk.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SoftAssertDemo {
		
		@Test
		public void testFacebook() throws Exception {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name("email")).sendKeys("abcdjhgdbhvf",Keys.ENTER);
			
			SoftAssert softassert=new SoftAssert();
			//Title
			String expectedresult="Facebook – log in or sign up";
			String actualresult=driver.getTitle();
			softassert.assertEquals(actualresult, expectedresult,"Title Mismatched");
			
			//URL 
			String actualUrl=driver.getCurrentUrl();
			String expectedUrl="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjQ0OTE5NDczLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
			softassert.assertNotEquals(actualUrl, expectedUrl,"URL mismatched");
			
			//Title
			String actualtitle=driver.findElement(By.name("email")).getAttribute("value");
			String expectedtitle="";
			softassert.assertEquals(actualtitle, expectedtitle,"Title mismatched");
			
			//Border
			String actualbordervalue=driver.findElement(By.name("email")).getCssValue("border");
			String expectedbordervalue="1px solid rgb(240, 40, 73)";
			softassert.assertEquals(actualbordervalue, expectedbordervalue,"URL mismatched");
			
			// Error message
			String actualerror=driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]")).getText();
			String expectederror="The email address or mobile number you entered isn't connected to an account. Find your account and log in.";
			softassert.assertEquals(actualerror, expectederror,"error mismatched");
			
			driver.quit();
			softassert.assertAll();
			
		}
}
