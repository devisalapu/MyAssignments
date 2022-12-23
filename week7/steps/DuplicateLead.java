package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DuplicateLead extends Baseclass{
	public String firstName;
	
	@Given("Click on CRMSFA for Duplicate Lead")
	 public void clickCrmsfaDupLd(){
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	 }
	 @And("Click on Leads for Duplicate Lead")
	 public void clickLeadsDupLd() {
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
	 }
	 @And("Click on Find Lead to find specific Lead ID")
	 public void clickFindLeadDupLd() {
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click(); 
	 }
	 @And("Click on email and enter as {string}")
	 public void enterfNameEdit(String eMail) {
		 driver.findElement(By.xpath("//span[text()='Email']")).click();
			
			driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys(eMail);
			
	 } 
	@When("Click on Find Lead button to get the specific Lead to Duplicate")	
	public void clickFdLeadDelete() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();	
		Thread.sleep(2000);
	}
  @Then("Click and store the firstname of the Lead ID from the result Lead in a variable")
  public void clickLdIdDup() throws InterruptedException {
	   firstName = driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-firstName')]/div[contains(@class,'x-grid3-col-firstName')]/a[@class='linktext']")).getText();
		Thread.sleep(2000);
	   
	   driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]/div[contains(@class,'x-grid3-col-partyId')]/a[@class='linktext']")).click();
		
  }
  @Then("Click on Duplicate Button and verify for Duplicate Lead page")
  public void clickDuplicateButton() throws InterruptedException {

	  driver.findElement(By.xpath("//a[@href='duplicateLeadForm?partyId=12905']")).click();
	    
	    String text = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
	    		 			
		if(text.contains("Duplicate"))
		{
			System.out.println("Navigated to Duplicate Lead Page Successfully");
		}else
		{
			System.out.println("It's not Navigated to Duplicate Lead Page");
		}
	    Thread.sleep(2000);
	    }
   @When("Click on Create Lead to duplicate specific Lead")
     public void clickCrtLdDup() {
	   driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
   }
   @Then("Validate Duplicate Lead ID process")
   public void verifyDupId() {
	   String dupFirst = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
	    
 	    
	    if(firstName.equalsIgnoreCase(dupFirst))
		{
			System.out.println("The lead name is matching ,Successfully duplicated");
		}else
		{
			System.out.println("The lead name is not matching, duplication is not successfull");
		}
   }
}
