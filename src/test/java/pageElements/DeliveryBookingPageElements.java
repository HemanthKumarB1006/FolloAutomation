package pageElements;

import org.openqa.selenium.By;

public interface DeliveryBookingPageElements {
	
	
	By clickALLBookings = By.xpath("//span[text()=' All Bookings ']");
	By clickDeliveryBookings = By.xpath("(//span[text()='Delivery Bookings'])[1]");
	By clickCreateNewDeliveryBookings = By.xpath("//button[text()=' Create New ']");
	By enterDeliveryDescription = By.xpath("//textarea[@placeholder='Enter Description']");
	By selectGate = By.xpath("//select[@formcontrolname='GateId']");
	By selectEquipment = By.xpath("//select[@formcontrolname='EquipmentId']");
	By selectRecurrence = By.xpath("//select[@formcontrolname='recurrence']");
	By buttonCancelDelivery = By.xpath("//button[text()=' Cancel ']");
	By buttonSubmitDelivery = By.xpath("//button[text()='Submit ']");
	By clickDeliveryDate = By.xpath("//input[@formcontrolname='deliveryDate']");
	By getDeliveryID = By.xpath("//input[@disabled='disabled']");
	By selectTodayDate = By.xpath("//span[@class='today selected']");
	By enterFromTimeHH = By.xpath("(//input[@placeholder='HH'])[1]");
	By enterFromTimeMM = By.xpath("(//input[@placeholder='MM'])[1]");
	By enterToTimeHH = By.xpath("(//input[@placeholder='HH'])[2]");
	By enterToTimeMM = By.xpath("(//input[@placeholder='MM'])[2]");
	By buttonModelClose = By.xpath("//img[@alt='Modal Close']");
	By searchDeliveryBookings = By.xpath("//input[@placeholder='What are you looking for?']");
	By buttonVoidList = By.xpath("//button[text()=' Void List ']");
	By chooseLocation = By.xpath("//span[text()='Choose Location']");
	By searchLocation = By.xpath("(//input[@placeholder=\"Search\"])[3]");
	
	
//	Filter
	By clickFilterIcon = By.xpath("//div[@class='filter-icon']");
	By enterFilterDescription = By.xpath("//input[@placeholder='Desciription']");
	By filterByCompany = By.xpath("//select[@formcontrolname='companyFilter']");
	
	
	
	
	
	
	
	
	
}
