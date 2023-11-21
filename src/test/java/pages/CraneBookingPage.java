package pages;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;

import frameworkEnums.SelectStrategy;
import master.MasterPage;
import pageElements.CraneBookingPageElements;
import reports.ExtentLogger;
import utilities.RuntimePropertyFileUtils;

public class CraneBookingPage extends MasterPage implements CraneBookingPageElements {

	public CraneBookingPage craneEquipmentCreation(HashMap<String, String> addnewCraneEquipment) {
		try {
			waitUntil(4000);
			clickElement(clickNewEquipment);
			clickElement(enterEquipmentName);
			String random3 = addnewCraneEquipment.get("CRANEEQUIPMENTNAME");
			String Dummy3 = RandomStringUtils.randomNumeric(3);
			String randomEquipmentName = random3 + Dummy3;
			enterData(enterEquipmentName, randomEquipmentName);
			clickElement(selectEquipmentType);
			selectOption(selectEquipmentType, SelectStrategy.VALUE, addnewCraneEquipment.get("CRANEEQUIPMENTValue"));
			ImplicitWait();
			selectOption(selectContactPerson, SelectStrategy.VALUE, addnewCraneEquipment.get("CONTACTVALUE"));
			downArrowKeyPressMCQ();
			clickElement(clickEquipmentSubmit);
			System.out.println("Crane equipment created successfully");
			ExtentLogger.pass("Crane equipment created successfully");

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		return this;
	}

	public CraneBookingPage craneBookingCreation(HashMap<String, String> addnewCraneBooking) {
		try {
			waitUntil(6000);
			clickElement(clickALLBookings);
			clickElement(clickCraneBookings);
			clickElement(clickCreateNewCraneBookings);
			String descriptionData = addnewCraneBooking.get("DELIVERYDESCRIPTION");
			String Dummy2 = RandomStringUtils.randomNumeric(3);
			String randomCraneBooking = descriptionData + Dummy2;
			enterData(enterCraneDescription, addnewCraneBooking.get("DELIVERYDESCRIPTION"));
			clickElement(buttonCancelCrane);
			clickElement(buttonEquipmentNo);
			clickElement(buttonCancelCrane);
			clickElement(buttonEquipmentYes);
			waitUntil(4000);
			clickElement(clickCreateNewCraneBookings);
			enterData(enterCraneDescription, randomCraneBooking);
			RuntimePropertyFileUtils.appendToPropFile("SearchCrane", randomCraneBooking);
			clickElement(clickCraneDate);
			Calendar calendar = Calendar.getInstance();
			calendar.add(Calendar.DATE, 2);
			calendar.add(Calendar.MONTH, 0);
			calendar.add(Calendar.YEAR, 0);
			Date time = calendar.getTime();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/YYYY");
			String format = simpleDateFormat.format(time);
			System.out.println(format);
			clearData(clickCraneDate);
			enterData(clickCraneDate, format);
			clickElement(enterFromTimeHH);
			clearData(enterFromTimeHH);
			enterData(enterFromTimeHH, addnewCraneBooking.get("FROMTIMEHH"));
			clickElement(enterToTimeHH);
			clearData(enterToTimeHH);
			enterData(enterToTimeHH, addnewCraneBooking.get("TOTIMEHH"));
			clickElement(selectPmButton);
			clearData(enterPickingFrom);
			enterData(enterPickingFrom, addnewCraneBooking.get("PICKINGFROM"));
			clearData(enterPickingTo);
			enterData(enterPickingTo, addnewCraneBooking.get("PICKINGTO"));
			clickElement(selectEquipment);
			downArrowKeyPressMCQ();
			clickElement(locationDropdownArrow);
			moveToElementClick(selectLocation);
			clickElement(locationDropdownArrow);
			moveToElementClick(selectLocation);
			clickElement(buttonSubmitCrane);
			waitUntil(6000);
			String runTimePropertyForCrane = RuntimePropertyFileUtils.getRunTimeProperty("SearchCrane");
			waitUntil(8000);
			moveToElementEnterData(searchCraneBookings, runTimePropertyForCrane);
			enterData(searchCraneBookings, runTimePropertyForCrane);	
			 String getCraneBookingData = getData(getCraneData);
			 System.out.println("Crane Bookings created Successfully" +getCraneBookingData);
			 Assert.assertEquals(runTimePropertyForCrane, getCraneBookingData);
			 ExtentLogger.pass("Crane Bookings created Successfully");
			
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		return this;
	}

}
