package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DelLeadInfoPage extends BaseClass{
	
	
	public DelLeadInfoPage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	/*public DelLeadInfoPage enterPhNumDel(String pArea, String pNumb) {
		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
			
			driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys(pArea);
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNumb);
			return this;
		 
	 } */
	//@When("Click on Find Lead button to get specific Lead")	
	public VerifyDelLeadPage clickFdLeadDelete() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();	
		Thread.sleep(2000);
		return new VerifyDelLeadPage(driver);
	}
  //@Then("Click and store the Lead ID from the result Lead in a variable")
	public DelLeadInfoPage enterPhNumDel(String pArea, String pNumb) {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys(pArea);
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNumb);
		return this;
		//return null;
	}
  

}
