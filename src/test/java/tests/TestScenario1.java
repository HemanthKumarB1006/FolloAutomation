package tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import master.MasterWrapper;
import utilities.DataProviderUtils;

public class TestScenario1 extends MasterWrapper {
	
//
	
	@Test(dataProvider = "TestScenario1", dataProviderClass = DataProviderUtils.class,priority = 1)
	public void TestCase1(HashMap<String, String> testData) throws Exception {
		loginPage.userLogin(testData)
		.checkData()
		.navigateToSettingsPage()
		.createCompanies(testData)
		.createGates(testData)
		.createEquipment(testData)
		.CreateDFOW(testData)
		
		;
		
	}

//  
	
	@Test(dataProvider = "TestScenario1", dataProviderClass = DataProviderUtils.class,priority = 2)
	public void TestCase3(HashMap<String, String> testData) {
		loginPage.userLogin(testData)
		.navigateToDelieryBookingPage()
		.deliveryBooking(testData)
	;
	}
}
