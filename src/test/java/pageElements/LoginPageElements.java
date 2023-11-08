package pageElements;

import org.openqa.selenium.By;

public interface LoginPageElements {

	By textboxUserName = By.xpath("//input[@type='email']");
	By textboxPassword = By.xpath("//input[@type='password']");
	By buttonLogin = By.xpath("//button[@type='submit']");
	By labelCompany = By.xpath("//p[text()='Company']");
	By companyDropDown = By.xpath("//img[@alt='Down Arrow']");
	By selectCompany = By.xpath("//li[text()=' Optisol business solution private limited ']");
	By projectDropdown = By.xpath("(//img[@alt='Down Arrow'])[2]");
	By selectProject = By.xpath("//li[text()=' Automation Testing  ']");
	By clickCancel = By.xpath("//button[text()='Cancel']");
	By labelDeliveryCalendar = By.xpath("//span[text()='Delivery Calendar']");
	
	By textDashbord = By.xpath("//span[text()='Dashboard']");

}

