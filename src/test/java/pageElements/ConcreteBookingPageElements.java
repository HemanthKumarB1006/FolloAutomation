package pageElements;

import org.openqa.selenium.By;

public interface ConcreteBookingPageElements {
	By clickALLBookings = By.xpath("//span[text()=' All Bookings ']");
	By clickConcreteBookings = By.xpath("(//span[text()='Concrete Bookings'])[1]");
	By clickCreateNewConcreteBookings = By.xpath("//button[text()=' Create New ']");
	By enterConcreteDescription = By.xpath("//textarea[@formcontrolname='description']");
	By buttonCancelConcrete = By.xpath("//button[text()=' Cancel ']");
	By buttonSubmitConcrete = By.xpath("//button[text()=' Submit ']");
	By enterAdditionalLocationDetails = By.xpath("//input[@formcontrolname='location']");
	By clickConcreteDate = By.xpath("//input[@formcontrolname='concretePlacementDate']");
	By enterMixdesign = By.xpath("(//input[@formcontrolname='item'])[2]");
	By enterOrderNumber = By.xpath("//input[@formcontrolname='concreteOrderNumber']");
	By enterSlumb = By.xpath("//input[@formcontrolname='slump']");
	By enterTruckSpacing = By.xpath("//input[@formcontrolname='truckSpacingHours']");
	By enterQuantityOrder = By.xpath("//input[@formcontrolname='concreteQuantityOrdered']");
	By enterPrimerForPump = By.xpath("//input[@formcontrolname='primerForPump']");
	By locationDropdownArrow = By.xpath("(//span[@class='dropdown-multiselect__caret'])[1]");
	By chooseLocation = By.xpath("//span[text()='Choose Location']");
	By searchLocation = By.xpath("(//input[@placeholder='Search'])[4]");
	By selectLocation = By.xpath("//label[text()='Location']//following ::li[@class='multiselect-item-checkbox ng-star-inserted'][1]");
	By enterFromTimeHH = By.xpath("(//input[@placeholder='HH'])[1]");
	By enterFromTimeMM = By.xpath("(//input[@placeholder='MM'])[1]");
	By enterToTimeHH = By.xpath("(//input[@placeholder='HH'])[2]");
	By enterToTimeMM = By.xpath("(//input[@placeholder='MM'])[2]");
	By selectPmButton = By.xpath("//label[text()='Anticipated Completion Time']//following::button[@class='btn btn-default text-center']");
	By buttonYes = By.xpath("//button[text()=' Yes ']");
	By buttonNo = By.xpath("//button[text()=' No ']");
	By getConcreteData = By.xpath("(//p[@class='pumpsize-gridoption mb-0'])[1]");
	By searchConcreteBookings = By.xpath("//input[@placeholder='What are you looking for?']");
	By clickFilterIcon = By.xpath("//div[@class='filter-icon']");
	By enterFilterDescription = By.xpath("//input[@placeholder='Desciription']");
	By filterByCompany = By.xpath("//select[@formcontrolname='companyFilter']");
	


	
	
	
	
}
