package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class CreateLeadPage extends BaseClass {
	
	public CreateLeadPage(RemoteWebDriver driver) {
		this.driver = driver;		
	}

	
	public CreateLeadPage enterCompanyName(String cName) {		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(cName);
		
		return this;
	}

	public CreateLeadPage enterFirstName(String fName) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(fName);
		
		return this;
	}

	public CreateLeadPage enterLastName(String lName) {
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(lName);
		
		return this;
	}

	public void submitCreateLead() {
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
	}

	}

