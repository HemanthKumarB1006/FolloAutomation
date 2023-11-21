package pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import drivers.DriverManager;
import frameworkEnums.SelectStrategy;
import master.MasterPage;
import pageElements.DeliveryBookingPageElements;
import reports.ExtentLogger;
import utilities.RuntimePropertyFileUtils;

public class DeliveryBookingPage extends MasterPage implements DeliveryBookingPageElements {

	public DeliveryBookingPage deliveryBooking(HashMap<String, String> addnewDelivery) {

		try {
			clickElement(clickCreateNewDeliveryBookings);
			waitUntil(4000);
			clickElement(buttonCancelDelivery);
			clickElement(clickCreateNewDeliveryBookings);
			String descriptionData = addnewDelivery.get("DELIVERYDESCRIPTION");
			String Dummy2 = RandomStringUtils.randomNumeric(3);
			String randomDeliveryBooking = descriptionData + Dummy2;
			enterData(enterDeliveryDescription, randomDeliveryBooking);
			RuntimePropertyFileUtils.appendToPropFile("SearchDelivery", randomDeliveryBooking);
			clickElement(clickDeliveryDate);
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.DATE, 2);
			calendar.add(Calendar.MONTH, 0);
			calendar.add(Calendar.YEAR, 0);
			Date time = calendar.getTime();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/YYYY");
			String format = simpleDateFormat.format(time);
			System.out.println(format);
//			int year = calendar.get(Calendar.YEAR);
//	        int month = calendar.get(Calendar.MONTH);  // Month is zero-based (0 to 11)
//	        int day = calendar.get(Calendar.DAY_OF_MONTH);
//	        String dateXPath = "//td[@data-year='" + year + "' and @data-month='" + month + "']/a[text()='" + day + "']";
			clearData(clickDeliveryDate);
			enterData(clickDeliveryDate, format);
			clickElement(selectGate);
			downArrowKeyPressMCQ();
			clickElement(selectEquipment);
			downArrowKeyPressMCQ();
			clickElement(enterFromTimeHH);
			clearData(enterFromTimeHH);
			enterData(enterFromTimeHH, addnewDelivery.get("FROMTIMEHH"));
			clickElement(enterToTimeHH);
			clearData(enterToTimeHH);
			enterData(enterToTimeHH, addnewDelivery.get("TOTIMEHH"));
			clickElement(selectPmButton);
			clickElement(locationDropdownArrow);
			moveToElementClick(selectLocation);
			clickElement(locationDropdownArrow);
			moveToElementClick(selectLocation);
			clickElement(buttonSubmitDelivery);
			waitUntil(6000);
			String runTimePropertyForDelivery = RuntimePropertyFileUtils.getRunTimeProperty("SearchDelivery");
			waitUntil(8000);
			moveToElementEnterData(searchDeliveryBookings, runTimePropertyForDelivery);
			enterData(searchDeliveryBookings, runTimePropertyForDelivery);	
			 String getDeliveryBookingData = getData(getDeliveryData);
			 System.out.println("Delivery Bookings created Successfully" +getDeliveryBookingData);
			 Assert.assertEquals(runTimePropertyForDelivery, getDeliveryBookingData);
			 ExtentLogger.pass("Delivery Bookings created Successfully");

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		return this;

	}

}
