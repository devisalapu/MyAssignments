/* package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
//import io.cucumber.java.en.Then;

public class VerifyEditLeadPage extends BaseClass{
	
	public VerifyEditLeadPage(RemoteWebDriver driver, String upd) {
		this.driver = driver;
	}

	//@Then("Check Company name is updated or not")
	public void checkcmpname() {
		
		EditLeadInfopage edit = new EditLeadInfopage(driver);
		System.out.println("In VerifyEditLeadPage: ");
      String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
      
		if (companyName.equalsIgnoreCase(edit.update))
		
		{
		    System.out.println("Company name updated");
		}
		
		else  
		{
			System.out.println("Company name is not updated");
		}
	}


}*/
