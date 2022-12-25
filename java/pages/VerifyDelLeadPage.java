package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import io.cucumber.java.en.Then;

public class VerifyDelLeadPage extends BaseClass{
	public String LeadID;
	public VerifyDelLeadPage(RemoteWebDriver driver) {
		this.driver = driver;		
	}
	 public VerifyDelLeadPage clickLdId() {
		   this.LeadID = driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]/div[contains(@class,'x-grid3-col-partyId')]/a[@class='linktext']")).getText();
			
			driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]/div[contains(@class,'x-grid3-col-partyId')]/a[@class='linktext']")).click();
		   return this;
	  }
	
	 public VerifyDelLeadPage checkLead() {
		  driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		  return this;
	  }
	  //@Then("enter the deleted Lead ID that stored in a variable")
	  public VerifyDelLeadPage enterDelID() throws InterruptedException {
		  
		  driver.findElement(By.xpath("//input[@name='id']")).sendKeys(this.LeadID);
		    driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		   
		    Thread.sleep(2000);
		    return this;
	  }
	 // @Then("Check for the existance of deleted Lead ID")
	  public void verifyDelLd() {
		  String msg = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		    System.out.println("id: "+ this.LeadID);
		    System.out.println("msg: "+ msg);
		    
		  if(msg.equalsIgnoreCase("No records to display"))
			{
				System.out.println("The lead "+ this.LeadID + " is successfully deleted");
			}else
			{
				System.out.println("The lead "+ this.LeadID + " is not deleted");
			}
		      
	  }
	public VerifyDelLeadPage clickDelButton() {
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	    return this;
	}
	   
}
