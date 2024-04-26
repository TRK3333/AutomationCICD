package com.comp.rk.testng;

import org.testng.annotations.Test;

public class TestGroupDependency {
	
	@Test(groups = "smoke")
	public void test1() {
		System.out.println("Smoke");
	}
	
	@Test(groups = "smoke")
	public void test2() {
		System.out.println("Smoke");
	}
	
	@Test(groups = "smoke")
	public void test3() {
		System.out.println("Smoke");
	}
	
	@Test(groups = "sanity")
	public void test4() {
		System.out.println("Sanity");
	}
	
	@Test(groups = "sanity")
	public void test5() {
		System.out.println("Sanity");
	}
	
	@Test(groups = "regression")
	public void test6() {
		System.out.println("Regression");
	}
	
	@Test(groups = "regression")
	public void test7() {
		System.out.println("Regression");
	}
	
	@Test(dependsOnGroups = {"smoke","sanity","regression"},alwaysRun = true)
	public void test() {
		System.out.println("Main Test");
	}
}
