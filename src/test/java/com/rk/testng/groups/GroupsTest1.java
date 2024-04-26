package com.rk.testng.groups;

import org.testng.annotations.Test;

public class GroupsTest1 {

	@Test(groups= {"smoke"})
	public void Test1() {
	System.out.println("Test1");	
	}
	
	@Test(groups = {"functional","sanity"})
	public void Test2() {
		System.out.println("Test2");
	}
	
	@Test(groups = {"sanity"})
	public void Test3() {
		System.out.println("Test3");
	}
}
