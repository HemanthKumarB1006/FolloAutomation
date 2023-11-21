package tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import master.MasterWrapper;
import utilities.DataProviderUtils;

public class TestScenario2 extends MasterWrapper {
	@Test(dataProvider = "TestScenario2", dataProviderClass = DataProviderUtils.class)
	public void TestCase4(HashMap<String, String> testdata) throws Exception {
		loginPage.userLogin(testdata)
		.checkData()
		.navigateToCraneBookingPage()
		.craneEquipmentCreation(testdata)
		.craneBookingCreation(testdata);
		

	}

	@Test(dataProvider = "TestScenario2", dataProviderClass = DataProviderUtils.class)
	public void TestCase5(HashMap<String, String> testdata) {
		loginPage.userLogin(testdata)
;
	}
	
	@Test(dataProvider = "TestScenario2", dataProviderClass = DataProviderUtils.class)
	public void TestCase6(HashMap<String, String> testdata) {
         loginPage.userLogin(testdata);	
      
}
}