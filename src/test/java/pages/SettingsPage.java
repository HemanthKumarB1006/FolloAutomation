package pages;

import java.util.HashMap;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.Assert;

import drivers.DriverManager;
import frameworkEnums.ElementCheckStrategy;
import frameworkEnums.SelectStrategy;
import master.MasterPage;
import pageElements.SettingsPageElemnet;
import reports.ExtentLogger;
import utilities.RuntimePropertyFileUtils;

public class SettingsPage extends MasterPage implements SettingsPageElemnet {

	public SettingsPage createCompanies(HashMap<String, String> companyData) {
		try {
			waitUntil(4000);
//			scrollDown();
//			clickElement(clickCompanies);
			clickElement(clickNewCompany);
			clickElement(modalCloseButton);
			clickElement(clickNewCompany);
			enterData(enterCompanyName, companyData.get("COMPANYNAME"));
			clickElement(popupCancelButton);
			clickElement(buttonNo);
			clickElement(popupCancelButton);
			clickElement(buttonYes);
			clickElement(clickNewCompany);
			String random1 = companyData.get("COMPANYNAME");
			String Dummy1 = RandomStringUtils.randomNumeric(4);
			String randomName = random1 + Dummy1;
			enterData(enterCompanyName, randomName);
			enterData(enterAddressLine1, companyData.get("COMPANYADDRESS"));
			waitUntil(4000);
			downArrowKeyPressMCQ();
			waitUntil(4000);
			clickElement(clickCompanySubmit);

			waitUntil(4000);
			if (checkCondition(buttonYes, ElementCheckStrategy.DISPLAYED)) {
				clickElement(buttonYes);
			} else {
				clickElement(clickCompanySubmit);
			}
			System.out.println("User created Company successfully");
			clickElement(clickCompanyName);
			waitUntil(4000);
			RuntimePropertyFileUtils.appendToPropFile("SearchCompany", randomName);
			waitUntil(7000);
			clickElement(getFilterIcon);
			clickElement(clickFilterCompanyName);
			enterData(clickFilterCompanyName, randomName);
			clickElement(clickApplyButton);
			System.out.println("User can be able to Filter Company Name successfully");

			String runTimeProperty = RuntimePropertyFileUtils.getRunTimeProperty("SearchCompany");
			String getCompaniesName = DriverManager.getDriver().findElement(By.xpath("(//div[@class='my-auto'])[2]"))
					.getText().trim();
			System.out.println(getCompaniesName);
			Assert.assertEquals(runTimeProperty, getCompaniesName);
			ExtentLogger.pass("Company Created Successfully");

		} catch (Exception e) {
			Assert.fail("Unable to Create Company " + e.getMessage());
		}
		return this;
	}

	public SettingsPage createGates(HashMap<String, String> gateData) {
		try {
			moveToElement(clickGates);
			scrollDown();
			clickElement(clickGates);
			clickElement(clickAddNewGate);
			clickElement(enterGateName);
			enterData(enterGateName, gateData.get("GATENAME"));
			clickElement(clickGateCancelButton);
			clickElement(buttonNo);
			clickElement(clickGateCancelButton);
			clickElement(buttonYes);
			clickElement(clickAddNewGate);
			clickElement(enterGateName);
			String random2 = gateData.get("GATENAME");
			String Dummy2 = RandomStringUtils.randomNumeric(3);
			String randomGateName = random2 + Dummy2;
			enterData(enterGateName, randomGateName);
			clickElement(clickGateSubmit);
			System.out.println("Gate had been created successfully");
			waitUntil(8000);
			moveToElementEnterData(searchGate, randomGateName);
			enterData(searchGate, randomGateName);
			RuntimePropertyFileUtils.appendToPropFile("SearchGate", randomGateName);
			String runTimePropertyForGate = RuntimePropertyFileUtils.getRunTimeProperty("SearchGate");
			String getGateName = getData(outputGate);
			System.out.println("Gate Name at search field" + getGateName);
			waitUntil(3000);
			Assert.assertEquals(runTimePropertyForGate, getGateName);
			ExtentLogger.pass("Gate created Successfully");

		} catch (Exception e) {
			Assert.fail("Unable to Create Company " + e.getMessage());
		}
		return this;
	}

	public SettingsPage createEquipment(HashMap<String, String> equipmentData) {
		try {
			moveToElement(clickEquipment);
			scrollDown();
			clickElement(clickEquipment);
			clickElement(clickNewEquipment);
			clickElement(enterEquipmentName);
			enterData(enterEquipmentName, equipmentData.get("EQUIPMENTNAME"));
			clickElement(selectEquipmentType);
			selectOption(selectEquipmentType, SelectStrategy.VALUE, equipmentData.get("EQUIPMENTValue"));
			ClickEnter();
			clickElement(selectContactPerson);
			selectOption(selectContactPerson, SelectStrategy.VALUE, equipmentData.get("CONTACTVALUE"));
			ClickEnter();

			clickElement(clickEquipmentCancelButton);
			clickElement(buttonEquipmentNo);
			clickElement(clickEquipmentCancelButton);
			clickElement(buttonEquipmentYes);
			clickElement(clickNewEquipment);
			clickElement(enterEquipmentName);
			String random3 = equipmentData.get("EQUIPMENTNAME");
			String Dummy3 = RandomStringUtils.randomNumeric(3);
			String randomEquipmentName = random3 + Dummy3;
			enterData(enterEquipmentName, randomEquipmentName);
			clickElement(selectEquipmentType);
			selectOption(selectEquipmentType, SelectStrategy.VALUE, equipmentData.get("EQUIPMENTValue"));
			ImplicitWait();
//			ClickEnter();
//3
			selectOption(selectContactPerson, SelectStrategy.VALUE, equipmentData.get("CONTACTVALUE"));
			downArrowKeyPressMCQ();
			ClickEnter();
//860
			RuntimePropertyFileUtils.appendToPropFile("SearchEquipment", randomEquipmentName);

			String runTimePropertyForEquipment = RuntimePropertyFileUtils.getRunTimeProperty("SearchEquipment");
			System.out.println(runTimePropertyForEquipment);
			clickElement(clickEquipmentSubmit);
			waitUntil(8000);
			moveToElementEnterData(searchEquipment, randomEquipmentName);
			enterData(searchEquipment, randomEquipmentName);
			String getEquipmentName = getData(outputEquipment);
			System.out.println("Equipment Name at search field" + getEquipmentName);
			waitUntil(3000);
			Assert.assertEquals(runTimePropertyForEquipment, getEquipmentName);
			ExtentLogger.pass("Equipment created Successfully");

		} catch (Exception e) {
			Assert.fail("Unable to Create Equipment " + e.getMessage());

		}
		return this;
	}

	public SettingsPage CreateDFOW(HashMap<String, String> getDFOWData) {
		try {

			moveToElement(clickDFOW);
			scrollDown();
			clickElement(clickDFOW);
			waitUntil(4000);
			clickElement(clickAddRowDFOW);
			clearData(enterSpectificationSection);
			String random4 = getDFOWData.get("DFOWNAME");
			String Dummy4 = RandomStringUtils.randomNumeric(3);
			String randomDFOWName = random4 + Dummy4;
			enterData(enterSpectificationSection, Dummy4);
			clickElement(enterDFOWName);
			enterData(enterDFOWName, randomDFOWName);
			RuntimePropertyFileUtils.appendToPropFile("SearchDFOW", randomDFOWName);
			String runTimePropertyForDFOW = RuntimePropertyFileUtils.getRunTimeProperty("SearchDFOW");
			System.out.println("Search DFOW to enter data :" +runTimePropertyForDFOW);
			clickElement(clickDFOWSaveButton);
			waitUntil(7000);
			moveToElementEnterData(searchDFOW, randomDFOWName);
			enterData(searchDFOW, randomDFOWName);
//			String getDFOWName = getData(outputDFOW);
//			System.out.println("DFOEW Name at search field" +getDFOWName);
			waitUntil(3000);
//			Assert.assertEquals(runTimePropertyForDFOW, getDFOWName);
			ExtentLogger.pass("DFOW created Successfully");

		} catch (Exception e) {
			
			Assert.fail("Unable to Create DFOW=  " + e.getMessage());
		}
		return this;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
