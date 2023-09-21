package pageElements;

import org.openqa.selenium.By;

public interface MasterPageElements {
	
	String linkPageMenu="//span[contains(text(),'%s')]";
	String linkPageSubMenu="//a[contains(text(),'%s')]";

	
	By linkLogout=By.xpath("//a[@class='logout']");
	

}
