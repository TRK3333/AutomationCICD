package com.comp.rk.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderReturnTypes {

	//@Test(dataProvider = "dp1")
	/*public void Demo(Object i) {
		System.out.println(i);
	}*/
	
	@Test(dataProvider = "dp2")
	public void Demo1(Object[][] o) {
		for(int i=0;i<o.length;i++) {
			System.out.println(o[i]);
		}
	}
	@DataProvider(name="dp1")
	public Object[] dp1() {
		Object[] data=new Object[] {
				1,
				"abcd",
				3
		};
		return data;
	}
	@DataProvider(name="dp2")
	public Object[][] dp2() {
		Object[][] data1 = new Object[][] {
			{"jhon",123,456,"cena"},
			{"pqr",234},
			{"xyz",189,12345}
			};
			return data1;
		}
	}
