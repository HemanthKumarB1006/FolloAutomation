package pages;

import org.testng.Assert;

import master.MasterPage;
import pageElements.DashboardPageElements;

public class DashboardPage extends MasterPage implements DashboardPageElements {

	public DashboardPage dashboard() {
		try {
			clickElement(dashboardclick);
		} catch (Exception e) {
			Assert.fail("unable to get text " + e.getMessage());
		}
		return this;
	}

}
