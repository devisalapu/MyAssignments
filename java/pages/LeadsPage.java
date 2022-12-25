package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class LeadsPage extends BaseClass{

	public LeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	
		
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/createLeadForm']")).click();
		return new CreateLeadPage(driver);
	}
	public EditLeadPage clickFindLeads() {
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		return new EditLeadPage(driver);
	}
	public DelLeadInfoPage clickFindLeadsDel() {
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		return new DelLeadInfoPage(driver);
	}
}
