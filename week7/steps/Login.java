package steps;


import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Baseclass{
	@And("Enter the Username as {string}")
	public void enterUserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	
	@And("Enter the Password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
 
 @When("Click on Login Button")
 public void clickLogin() {
	 driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	 	
 }
 
 @Then("Verify the home page is displayed")
 public void verifyHomepage() {
	 String title = driver.getTitle();
  System.out.println(title);
	// if(driver.findElement(By.linkText("CRM/SFA")).isDisplayed())
		//if(displayed) {
  if (title.contains("Leaftaps - TestLeaf")) {
			System.out.println("Homepage is verified");
		}
		else {
			System.out.println("Homepage is not displayed");
		}	
		
 }
 
}
