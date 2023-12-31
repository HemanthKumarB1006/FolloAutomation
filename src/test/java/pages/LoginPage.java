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

//			if (!findElementPresence(textDashbord)) {
//                throw new Exception("Unable to Login");
//            }
			ExtentLogger.pass("Login Success");
		} catch (Exception e) {
			Assert.fail("Unable to Login. " + e.getMessage());
		}
		return this;
	}

	public LoginPage checkData() throws Exception {
		waitUntil(7000);
		try {
			if (!findElementPresence(labelCompany)) {
				throw new Exception("Unable locate company");
			}

			if (!findElementPresence(labelDeliveryCalendar)) {
				throw new Exception("Unable locate Delivery Calendar");
			} else {
				System.out.println("true value ");
			}
			waitUntil(7000);
			clickElement(companyDropDown);
			clickElement(selectCompany);
			waitUntil(4000);
//			if (checkCondition(clickCancel, ElementCheckStrategy.DISPLAYED)) {
//				clickElement(clickCancel);
//			} else {
//				clickElement(projectDropdown);
//			}
			clickElement(projectDropdown);
			clickElement(selectProject);
			waitUntil(4000);

			ExtentLogger.pass("true 11 Success");
//	DriverManager.getDriver().findElement(iconSettings).click();
//	ExtentLogger.print("Setting clicked ");
		} catch (Exception e) {
			clickElement(clickCancel);
			waitUntil(4000);
			clickElement(projectDropdown);
			clickElement(selectProject);
			waitUntil(4000);
			
			Assert.fail("Unable to Login. " + e.getMessage());
		}
		return this;
	}
}
