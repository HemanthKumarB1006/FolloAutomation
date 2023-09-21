package master;

import org.openqa.selenium.By;
import org.testng.Assert;

import applicationEnums.MasterMenuList;
import pageElements.MasterPageElements;
import pages.DashboardPage;
import pages.DeliveryBookingPage;
import pages.SettingsPage;
import reports.ExtentLogger;
import utilities.DynamicXpathUtils;

public class MasterPage extends MasterWrapper implements MasterPageElements {

	public void userLogout() {
		try {
			clickElement(linkLogout);
			ExtentLogger.pass("LogOut Success");
		} catch (Exception e) {
			Assert.fail("Unable to Log Out. " + e.getMessage());
		}
	}

	public DashboardPage navigateToDashboardPage() {
		try {
			clickElement(By.xpath(DynamicXpathUtils.getXpathForEnum(linkPageMenu, MasterMenuList.Dashboard)));
			ExtentLogger.pass("Navigated to DashBoard Page");
		} catch (Exception e) {
			Assert.fail("Unable to Navigate to DashBoard Page. " + e.getMessage());
		}
		return new DashboardPage();
	}

	public SettingsPage navigateToSettingsPage() {
		try {
			waitUntil(4000);
			clickElement(By.xpath(DynamicXpathUtils.getXpathForEnum(linkPageMenu, MasterMenuList.Settings)));
			waitUntil(4000);
			scrollDown();
			clickElement(By.xpath(DynamicXpathUtils.getXpathForString(linkPageMenu, "Companies")));
			ExtentLogger.pass("Navigated to Setting page");
			scrollDown();
		} catch (Exception e) {

			Assert.fail("Unable to Navigated to Setting page. " + e.getMessage());
		}
		return new SettingsPage();
	}

	public DeliveryBookingPage navigateToDelieryBookingPage() {
		try {
			clickElement(By.xpath(DynamicXpathUtils.getXpathForEnum(linkPageMenu, MasterMenuList.All)));
			clickElement(By.xpath(DynamicXpathUtils.getXpathForString(linkPageMenu, "Delivery Bookings")));
			ExtentLogger.pass("Navigated to Delivery Booking page ");
		} catch (Exception e) {
			Assert.fail("Unable to navigate Delivery Bookings page" + e.getMessage());
		}

		return new DeliveryBookingPage();

	}
}
