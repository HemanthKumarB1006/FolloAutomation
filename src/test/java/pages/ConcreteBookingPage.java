package pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;

import master.MasterPage;
import pageElements.ConcreteBookingPageElements;
import reports.ExtentLogger;
import utilities.RuntimePropertyFileUtils;

public class ConcreteBookingPage extends MasterPage implements ConcreteBookingPageElements {

	public ConcreteBookingPage createConcreteBooking(HashMap<String, String> addnewConcreteBooking) {
		try {
			waitUntil(6000);
			clickElement(clickCreateNewConcreteBookings);
			waitUntil(4000);
			String descriptionData = addnewConcreteBooking.get("CONCRETEDESCRIPTION");
			String Dummy2 = RandomStringUtils.randomNumeric(3);
			String randomConcreteBooking = descriptionData + Dummy2;
			enterData(enterConcreteDescription, addnewConcreteBooking.get("CONCRETEDESCRIPTION"));
			clickElement(buttonCancelConcrete);
			clickElement(buttonNo);
			clickElement(buttonCancelConcrete);
			clickElement(buttonYes);
			waitUntil(4000);
			clickElement(clickCreateNewConcreteBookings);
			enterData(enterConcreteDescription, randomConcreteBooking);
			RuntimePropertyFileUtils.appendToPropFile("SearchConcrete", randomConcreteBooking);
			clickElement(locationDropdownArrow);
			moveToElementClick(selectLocation);
			clickElement(locationDropdownArrow);
			moveToElementClick(selectLocation);
			clickElement(enterAdditionalLocationDetails);
			enterData(enterAdditionalLocationDetails, addnewConcreteBooking.get("ADDITIONALDETAILS"));
			clickElement(clickConcreteDate);
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.DATE, 2);
			calendar.add(Calendar.MONTH, 0);
			calendar.add(Calendar.YEAR, 0);
			Date time = calendar.getTime();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/YYYY");
			String format = simpleDateFormat.format(time);
			System.out.println(format);
			clearData(clickConcreteDate);
			enterData(clickConcreteDate, format);
			clickElement(enterFromTimeHH);
			clearData(enterFromTimeHH);
			enterData(enterFromTimeHH, addnewConcreteBooking.get("FROMTIMEHH"));
			clickElement(enterToTimeHH);
			clearData(enterToTimeHH);
			enterData(enterToTimeHH, addnewConcreteBooking.get("TOTIMEHH"));
			clickElement(selectPmButton);
			clickElement(enterMixdesign);
			enterData(enterMixdesign, addnewConcreteBooking.get("MIXDESIGN"));
			ClickEnter();
			clickElement(enterOrderNumber);
			enterData(enterOrderNumber, addnewConcreteBooking.get("ORDERNUMBER"));
			clickElement(enterSlumb);
			enterData(enterSlumb, addnewConcreteBooking.get("SLUM"));
			scrollDown();
			clickElement(enterTruckSpacing);
			enterData(enterTruckSpacing, addnewConcreteBooking.get("TRUCKSPACING"));
			clickElement(enterQuantityOrder);
			enterData(enterQuantityOrder, addnewConcreteBooking.get("QUANTITYORDER"));
			clickElement(enterPrimerForPump);
			enterData(enterPrimerForPump, addnewConcreteBooking.get("PRIMERFORPUMP"));
			clickElement(buttonSubmitConcrete);
			waitUntil(6000);
			String runTimePropertyForConcrete = RuntimePropertyFileUtils.getRunTimeProperty("SearchConcrete");
			waitUntil(8000);
			moveToElementEnterData(searchConcreteBookings, runTimePropertyForConcrete);
			enterData(searchConcreteBookings, runTimePropertyForConcrete);	
			 String getConcreteBookingData = getData(getConcreteData);
			 System.out.println("Concrete Bookings created Successfully" +getConcreteBookingData);
			 Assert.assertEquals(runTimePropertyForConcrete, getConcreteBookingData);
			 ExtentLogger.pass("Concrete Bookings created Successfully");
				
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		return this;
	}
}
