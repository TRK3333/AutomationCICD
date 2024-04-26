package com.comp.rk.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestDependency {
	static String trackingNumber=null;
	@Ignore
	@Test()
	public void createShipment() {
		System.out.println(5/0);
		System.out.println("Shipment created");
		trackingNumber="ABC12IJ";
	}
	@Test(dependsOnMethods = {"createShipment"},ignoreMissingDependencies = true)
	public void trackShipment() throws Exception {
		if(trackingNumber != null)
			System.out.println("Shipment Tracking");
		else
			throw new Exception("Invalid Tracking Number");
	}
	@Test(dependsOnMethods = {"createShipment","trackShipment"},ignoreMissingDependencies = true)
	public void cancelShipment() throws Exception {
		if(trackingNumber != null)
			System.out.println("Shipment Cancelled");
		else
			throw new Exception("Invalid Tracking Number");
	}
}
