package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends Baseclass{
	public String update;
	@Given("Click on CRMSFA")
	 public void clickCrmsfaEdit(){
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	 }
	 @And("Click on Leads")
	 public void clickLeadEdit() {
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
	 }
	 @And("Click on Find Lead")
	 public void clickFindLead() {
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click(); 
	 }
	 @And("Enter the First name in Edit as {string}")
	 public void enterfNameEdit(String fName) {
		 driver.findElement(By.xpath("(//form[@class=' x-form']//input[@name='firstName'])[3]")).sendKeys(fName);
		 
	 } 
	@When("Click on Find Lead button")	
	public void clickFdLead() throws InterruptedException {
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();	
		Thread.sleep(2000);
	}
	@Then("Click on Lead ID from result")
	public void clickLeadid() {
		driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]/div[contains(@class,'x-grid3-col-partyId')]/a[@class='linktext']")).click();
	}
	@Then("Verify expected Lead page is displayed")
	public void verifyLead() {
		String title = driver.getTitle();
		System.out.println("Title" + title);

	}
	@Then("Click on Edit Button")
	public void clickEdit() {
		driver.findElement(By.xpath("//a[@href='updateLeadForm?partyId=12963']")).click();
	}
	@And("Clear the Company Name")
	public void clearcmpname() {
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
	}
	@And("Enter new Company Name as {string} and store the company name in a variable")
	public void entercmpname(String cName)
	{
       driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys(cName);
		
		 update = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).getText();
		
	}
	@Then("Click on update button")
	public void clickUpdate() {
		driver.findElement(By.xpath("//input[@value='Update']")).click();
	}
	@Then("Check Company name is updated or not")
	public void checkcmpname() {
      String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		if (companyName.contains(update))
		
		{
		    System.out.println("Company name updated");
		}
		
		else  
		{
			System.out.println("Company name is not updated");
		}
	}
}
