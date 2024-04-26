package com.comp.rk.testng;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class PrioritiesFlightBookingTest {
	WebDriver driver;
	@Test(priority=1)
	public void signUp() {
		System.out.println("Sign up");
	}
	
	@Test(priority=2)
	public void login() {
		System.out.println("Log in");
	}
	
	@Test(priority=3)
	public void searchForFlight() {
		System.out.println("Searching for flight");
	}
	
	@Test(priority=4)
	public void bookFlight() {
		System.out.println("Book your Flight");
	}
	
	@Test(priority=5)
	public void downloadTicket() {
		System.out.println("Download Ticket");
	}
	
	@Test(priority=6)
	public void logout() {
		System.out.println("logout");
	}
}
