package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

 public class MergeLead extends Baseclass{
	 
	@Given("Click on CRMSFA for Merge Lead")
	 public void clickCrmsfaMergLd(){
		 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
	 }
	 @And("Click on contacts")
	 public void clickContacts() {
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/contactsMain\']")).click();
	 }
	 @When("Cick on Merge contacts")
	 public void clickMergContact() {
		 driver.findElement(By.xpath("//a[@href='/crmsfa/control/mergeContactsForm']")).click();
	 }
	 @Then("Select From contact from the contacts")
	 public void fromContact() throws InterruptedException {
	 driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']")).click();
		
     Set<String> WindowHandle = driver.getWindowHandles();
		
		List<String> windows = new ArrayList<String>(WindowHandle);
		
		driver.switchTo().window(windows.get(1));
		
		String str = driver.getTitle();
		
		System.out.println("Title " + str);
		
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]/div[contains(@class,'x-grid3-col-partyId')]/a[@class='linktext']")).click();
		  
			driver.switchTo().window(windows.get(0));
		String str1 = driver.getTitle();
		  System.out.println(str1);
		  
		  driver.findElement(By.xpath("//a[contains(@href,'partyIdTo')]")).click();
	 }
	 @And ("Select To contact from the contacts")
	 public void toContact() throws InterruptedException {
		 Set<String> WindowHandle1 = driver.getWindowHandles();
			
			List<String> windows1 = new ArrayList<String>(WindowHandle1);
			
		  driver.switchTo().window(windows1.get(1));
			
			String str2 = driver.getTitle();
			
			System.out.println("Title " + str2);
			
			  Thread.sleep(2000);

			
			String str3 = driver.getTitle();
			
			System.out.println("Title " + str3);
		  
			driver.findElement(By.xpath("//div[@class = 'x-grid3-body']/div[2]/table/tbody/tr/td/div/a")).click();

			driver.switchTo().window(windows1.get(0));
			
			
	 }
	 @Then("Click on Merge")
	 public void clickMerge() {
		 driver.findElement(By.className("buttonDangerous")).click();
			
			Alert acpt= driver.switchTo().alert();
			acpt.accept();
	 }
	 @And("Verify Merge contact")
	 public void verify() {
		 String str4 = driver.getTitle();
			
			System.out.println("Title " + str4);
	 }
	  
}
