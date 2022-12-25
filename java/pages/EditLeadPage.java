package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
/*import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;*/
public class EditLeadPage extends BaseClass{
	
	public EditLeadPage(RemoteWebDriver driver) {
		this.driver = driver;		
	}
	
	public EditLeadPage enterfNameEdit(String fstName) {
		driver.findElement(By.xpath("(//form[@class=' x-form']//input[@name='firstName'])[3]")).sendKeys(fstName);
		return this;
	}
		
	public EditLeadPage clickFdLead() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();	
		Thread.sleep(2000);
		return this;
	}
	
	
	public EditLeadInfopage clickLeadid() {
		driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]/div[contains(@class,'x-grid3-col-partyId')]/a[@class='linktext']")).click();
		return new EditLeadInfopage(driver);
	}
	
	
	
}
