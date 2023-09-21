package pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import drivers.DriverManager;
import frameworkEnums.SelectStrategy;
import master.MasterPage;
import pageElements.DeliveryBookingPageElements;

public class DeliveryBookingPage extends MasterPage implements DeliveryBookingPageElements {

	public DeliveryBookingPage deliveryBooking(HashMap<String, String> addnewDelivery) {

		try {
			waitUntil(4000);
//			clickElement(clickALLBookings);
//			clickElement(clickDeliveryBookings);
			clickElement(clickCreateNewDeliveryBookings);
			clickElement(buttonCancelDelivery);
			clickElement(clickCreateNewDeliveryBookings);
			enterData(enterDeliveryDescription, addnewDelivery.get("DELIVERYDESCRIPTION"));
			String descriptionData = getData(enterDeliveryDescription);
//			selectOption(selectEquipment, SelectStrategy.VALUE, addnewDelivery.get(""));
//			selectOption(selectGate, SelectStrategy.VALUE, addnewDelivery.get(""));
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
			clickElement(chooseLocation);
			downArrowKeyPressMCQ();
			clickElement(enterFromTimeHH);
			clearData(enterFromTimeHH);
			enterData(enterFromTimeHH, addnewDelivery.get("FROMTIMEHH"));
			clickElement(enterToTimeHH);
			clearData(enterToTimeHH);
			enterData(enterToTimeHH, addnewDelivery.get("TOTIMEHH"));
			clickElement(chooseLocation);
			downArrowKeyPressMCQ();
			clickElement(buttonSubmitDelivery);
			waitUntil(6000);
			moveToElementEnterData(searchDeliveryBookings, descriptionData);
			enterData(searchDeliveryBookings, descriptionData);			

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		return this;

	}

}
