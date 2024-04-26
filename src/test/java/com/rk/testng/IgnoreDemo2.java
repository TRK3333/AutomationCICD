package com.rk.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class IgnoreDemo2 {
	@Test
	public void Test4() {
		System.out.println("Test4");
	}
	
	@Ignore
	@Test
	public void Test5() {
		System.out.println("Test5");
	}
	
	@Test
	public void Test6() {
		System.out.println("Test6");
	}
}
