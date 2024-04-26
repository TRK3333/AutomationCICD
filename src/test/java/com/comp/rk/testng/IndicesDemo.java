package com.comp.rk.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IndicesDemo {

	@Test(dataProvider = "dp1")
	public void Demo(String s) {
		System.out.println(s);
	}
	@DataProvider(indices = {0,2})
	public String[] dp1() {
		String[] data=new String[] {
			"abc",
			"bcd",
			"cda",
			"bbaass"
		};
		return data;
	}
}
