package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;


public class EditLeadInfopage extends BaseClass{
	//public  String update=" ";
	public EditLeadInfopage(RemoteWebDriver driver) {
		this.driver = driver;		
	}
	public EditLeadInfopage verifyLead() {
		String title = driver.getTitle();
		System.out.println("Title" + title);
		return this;

	}
	
	public EditLeadInfopage clickEdit() {
		driver.findElement(By.xpath("//a[@href='updateLeadForm?partyId=12963']")).click();
		return this;
	}
	//@And("Clear the Company Name")
	public EditLeadInfopage clearcmpname() {
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		return this;
	}
	//@And("Enter new Company Name as {string} and store the company name in a variable")
	public EditLeadInfopage entercmpname(String cmpName)
	{
       driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(cmpName);
		
       this.update = cmpName;//driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).getText();
		 return this;
		
	}
	//@Then("Click on update button")
	public EditLeadInfopage clickUpdate() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		return this;//return new VerifyEditLeadPage(driver);
	}
    public void checkcmpname() {
		
		
	  System.out.println("In VerifyEditLeadPage: " +this.update);
      String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
      System.out.println("In VerifyEditLeadPage: " +companyName);
      
		if (companyName.contains(this.update))
		
		{
		    System.out.println("Company name updated");
		}
		
		else  
		{
			System.out.println("Company name is not updated");
		}
	}
}
