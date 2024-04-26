package com.rk.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreDemo1 {
	
	@Ignore
	@Test
	public void Test1() {
	System.out.println("Test1");	
	}
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
	@Test
	public void Test3() {
		System.out.println("Test3");
	}
}
