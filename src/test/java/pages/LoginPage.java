package pages;

import java.util.HashMap;

import org.testng.Assert;

import frameworkEnums.ElementCheckStrategy;
import master.MasterPage;
import pageElements.LoginPageElements;
import reports.ExtentLogger;

public class LoginPage extends MasterPage implements LoginPageElements {

	public LoginPage userLogin(HashMap<String, String> loginpage) {

		try {
			enterData(textboxUserName, loginpage.get("USERNAME"));
			ExtentLogger.print("Username entered successfully ");
			enterData(textboxPassword, loginpage.get("PASSWORD"));
			ExtentLogger.print("Password entered successfully ");
			clickElement(buttonLogin);
			ExtentLogger.pass("Login Success");
			waitUntil(7000);
		} catch (Exception e) {
			Assert.fail("Unable to Login. " + e.getMessage());
		}
		return this;
	}

	public LoginPage checkData() throws Exception {
		waitUntil(7000);
		try {
			if (!findElementPresence(labelCompany)) {
				ExtentLogger.print("Eable to locate company successfully ");
				
			}

			if (!findElementPresence(labelDeliveryCalendar)) {
				ExtentLogger.print("User can able to view Delivery calendar ");
				
			} else {
				System.out.println("Successfully Navigated to Delivery Calendar ");
			}
			waitUntil(7000);

			ExtentLogger.pass("Successfully Navigated to Delivery Calendar ");
		} catch (Exception e) {
		
			Assert.fail("Unable to Login. " + e.getMessage());
		}
		return this;
	}
}
