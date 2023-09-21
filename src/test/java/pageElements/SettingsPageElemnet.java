package pageElements;

import org.openqa.selenium.By;

public interface SettingsPageElemnet {

//Companies 

	By settingPageDropDown = By.xpath("(//img[@alt='Down Arrow'])[4]");
	By clickCompanies = By.xpath("(//span[text()='Companies']");
	By clickNewCompany = By.xpath("//button[contains(.,'New Company')]");
	By modalCloseButton = By.xpath("//img[@alt='Modal Close']");
	By popupCancelButton = By.xpath("//button[text()=' Cancel ']");
	By buttonYes = By.xpath("//button[text()=' Yes ']");
	By buttonNo = By.xpath("//button[text()=' No ']");

	By enterCompanyName = By.xpath("(//input[@type='text'])[1]");
	By enterAddressLine1 = By.xpath("(//input[@type='text'])[3]");
	By clickCompanySubmit = By.xpath("//button[@type='submit']");
	By searchCompanies = By.xpath("//div[@class='icon']");
	By getCompaniesName = By.xpath("(//div[@class=\"my-auto\"])[2]");
	By getFilterIcon = By.xpath("//div[@class='filter-icon']");
	By clickFilterCompanyName = By.xpath("//input[@type='text']");
	By clickApplyButton = By.xpath("//button[text()=' Apply ']");
	By clickCompanyName = By.xpath("//input[@type='text']");
	
// Gate 
	
	By clickGates = By.xpath("//span[text()='Gates']");
	By clickAddNewGate = By.xpath("//button[contains(.,'Add New Gate')]");
	By enterGateName = By.xpath("(//input[@type='text'])[2]");
	By clickGateCancelButton = By.xpath("//button[text()=' Cancel ']");
	By clickGateSubmit = By.xpath("//button[@type='submit']");
	By searchGate = By.xpath("//input[@placeholder='What you are looking for?']");
	By outputGate = By.xpath("(//td[@class='text-center'])[2]");
	

// Member

	By clickMembers = By.xpath("//span[text()='Members']");
	By clickInviteMembers = By.xpath("//button[contains(.,'Invite Member')]");
	By memberCancelButton = By.xpath("//button[text()=' Cancel ']");
	By entertextToAddMember = By.xpath("//input[@type='text']");
	By selectCompany = By.xpath("//div[text()=' Select Company ']");
	By selectRole = By.xpath("//div[text()=' Select Role ']");
	By selectSubContractor = By.xpath("//a[text()=' Sub Contractor ']");

	By clickSendInvite = By.xpath("//input[@type='text']");


// Equipment

	By clickEquipment = By.xpath("//span[text()='Equipment']");
	By clickNewEquipment = By.xpath("//button[contains(.,'New Equipment')]");
	By enterEquipmentName = By.xpath("(//input[@type='text'])[2]");
	By selectEquipmentType = By.id("equipmentType1");
	By selectContactPerson = By.xpath("//select[@formcontrolname='controlledBy']");
	By clickEquipmentCancelButton = By.xpath("//button[text()='Cancel']");
	By clickEquipmentSubmit = By.xpath("//button[@type='submit']");
	By searchEquipment = By.xpath("//input[@placeholder='What are you looking for?']");
	By outputEquipment = By.xpath("(//td[@class='text-center'])[2]");
	By buttonEquipmentYes = By.xpath("//button[text()='Yes']");
	By buttonEquipmentNo = By.xpath("//button[text()='No']");

//	DFOW

	By clickDFOW = By.xpath("//span[text()='Definable Feature Of Work']");
	By clickAddRowDFOW = By.xpath("//button[text()=' Add Row ']");
	By enterSpectificationSection = By.xpath("(//input[@type='text'])[1]");
	By enterDFOWName = By.xpath("(//input[@type='text'])[2]");
	By clickImportButton = By.xpath("//span[text()='Definable Feature Of Work']");
	By downloadSampleTemplate = By.xpath("//u[text()='Download sample template here']");
	By buttonExport = By.xpath("//button[text()=' Export ']");
	By clickDFOWCancelButton = By.xpath("//button[text()=' Cancel ']");
	By clickDFOWSaveButton = By.xpath("//button[@type='submit']");
	By searchDFOW= By.xpath("//input[@placeholder='What are you looking for?']");
	By outputDFOW = By.xpath("(//input[@type='text'])[2]");

}
