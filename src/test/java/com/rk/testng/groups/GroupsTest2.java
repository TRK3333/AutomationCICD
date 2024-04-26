package com.rk.testng.groups;

import org.testng.annotations.Test;

public class GroupsTest2 {
	
	@Test(groups = {"regression"})
	public void Test4() {
	System.out.println("Test4");	
	}
	
	@Test(groups = {"regression","sanity"})
	public void Test5() {
		System.out.println("Test5");
	}
	
	@Test(groups = {"smoke","sanity"})
	public void Test6() {
		System.out.println("Test6");
	}
	
	@Test
	public void Test7() {
		System.out.println("Test7");
	}
}
