package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends Baseclass{
	public String LeadID;
	@Given("Click on CRMSFA for Delete Lead")
	 public void clickCrmsfaDelete(){
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	 }
	 @And("Click on Leads for Delete Lead")
	 public void clickLeadDelete() {
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
	 }
	 @And("Click on Find Lead to find specific Lead")
	 public void clickFindLeadDelete() {
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click(); 
	 }
	 @And("Click on Phone and enter the Phone number  as (.*) and as (.*)$")
	 public void enterfNameEdit(String pArea, String pNumb) {
		 driver.findElement(By.xpath("//span[text()='Phone']")).click();
			
			driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys(pArea);
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pNumb);
		 
	 } 
	@When("Click on Find Lead button to get specific Lead")	
	public void clickFdLeadDelete() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();	
		Thread.sleep(2000);
	}
   @Then("Click and store the Lead ID from the result Lead in a variable")
   public void clickLdId() {
	    LeadID = driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]/div[contains(@class,'x-grid3-col-partyId')]/a[@class='linktext']")).getText();
		
		driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]/div[contains(@class,'x-grid3-col-partyId')]/a[@class='linktext']")).click();
	   
   }
   @Then("Click on Delete Button")
   public void clickDelButton() {

	    driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	    }
  @When("Click on Find Lead to check specific Lead got deleted or not")
  public void checkLead() {
	  driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
  }
  @Then("enter the deleted Lead ID that stored in a variable")
  public void enterDelID() throws InterruptedException {
	  driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadID);
	    driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	   
	    Thread.sleep(2000);
  }
  @Then("Check for the existance of deleted Lead ID")
  public void verifyDelLd() {
	  String msg = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
	    System.out.println("id: "+ LeadID);
	    System.out.println("msg: "+ msg);
	    
	  if(msg.equalsIgnoreCase("No records to display"))
		{
			System.out.println("The lead "+ LeadID + " is successfully deleted");
		}else
		{
			System.out.println("The lead "+ LeadID + " is not deleted");
		}
	      
  }
   
}
