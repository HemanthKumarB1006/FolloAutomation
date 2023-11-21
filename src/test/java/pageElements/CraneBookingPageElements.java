package pageElements;

import org.openqa.selenium.By;

public interface CraneBookingPageElements {
	By clickALLBookings = By.xpath("//span[text()=' All Bookings ']");
	By clickCraneBookings = By.xpath("(//span[text()='Crane Bookings'])[1]");
	By clickCreateNewCraneBookings = By.xpath("//button[text()=' Create New ']");
	By enterCraneDescription = By.xpath("//textarea[@placeholder='Enter Description']");
	By buttonCancelCrane = By.xpath("//button[text()=' Cancel ']");
	By buttonSubmitCrane = By.xpath("//button[text()='Submit ']");
	By clickCraneDate = By.xpath("//input[@formcontrolname='deliveryDate']");
	By enterPickingFrom = By.xpath("//textarea[@placeholder='Picking From']");
	By enterPickingTo = By.xpath("//textarea[@placeholder='Picking To']");
	By enterFromTimeHH = By.xpath("(//input[@placeholder='HH'])[1]");
	By enterFromTimeMM = By.xpath("(//input[@placeholder='MM'])[1]");
	By enterToTimeHH = By.xpath("(//input[@placeholder='HH'])[2]");
	By enterToTimeMM = By.xpath("(//input[@placeholder='MM'])[2]");
	By selectPmButton = By.xpath("//label[text()='To Time:']//following::button[@class='btn btn-default text-center']");
	By selectEquipment = By.xpath("//select[@formcontrolname='EquipmentId']");
	By locationDropdownArrow = By.xpath("(//span[@class='dropdown-multiselect__caret'])[4]");
	By chooseLocation = By.xpath("//span[text()='Choose Location']");
	By searchLocation = By.xpath("(//input[@placeholder='Search'])[4]");
	By selectLocation = By.xpath("//label[text()='Location ']//following ::li[@class='multiselect-item-checkbox ng-star-inserted'][1]");
	By getCraneData = By.xpath("(//span[@class='c-pointer'])[2]");
	By searchCraneBookings = By.xpath("//input[@placeholder='What are you looking for?']");
	
	
	
	
	By clickEquipment = By.xpath("//span[text()='Equipment']");
	By clickNewEquipment = By.xpath("//button[contains(.,'New Equipment')]");
	By enterEquipmentName = By.xpath("(//input[@type='text'])[2]");
	By selectEquipmentType = By.id("equipmentType1");
	By selectContactPerson = By.xpath("//select[@formcontrolname='controlledBy']");
	By clickEquipmentCancelButton = By.xpath("//button[text()='Cancel']");
	By clickEquipmentSubmit = By.xpath("//button[@type='submit']");
	By searchEquipment = By.xpath("//input[@placeholder='What are you looking for?']");
	By outputEquipment = By.xpath("(//td[@class='text-center'])[2]");
	By buttonEquipmentYes = By.xpath("//button[text()=' Yes ']");
	By buttonEquipmentNo = By.xpath("//button[text()=' No ']");
	
	
	
	
	
}
