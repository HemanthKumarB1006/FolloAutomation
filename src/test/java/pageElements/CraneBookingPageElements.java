package pageElements;

import org.openqa.selenium.By;

public interface CraneBookingPageElements {
	By clickALLBookings = By.xpath("//span[text()=' All Bookings ']");
	By clickCraneBookings = By.xpath("(//span[text()='Delivery Bookings'])[1]");
	By clickCreateNewCraneBookings = By.xpath("//button[text()=' Create New ']");
	By enterCraneDescription = By.xpath("//textarea[@placeholder='Enter Description']");
	
	
	
	
	
	
}
