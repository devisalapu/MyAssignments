package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadLogin extends Baseclass {
 //public ChromeDriver driver;
 
 /*@Given("Launch the Chrome Browser")
 
    public void launchBrowser() {
	 
	    WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
 }
  
 @And("Load the URL and Maximise")
  public void loadURL() {
		
		driver.get("http://leaftaps.com/opentaps/control.html");
		
		driver.manage().window().maximize();
	 
 }*/

/*	@And("Enter the Username as (.*)$")
	public void enterUserName(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	
	@And("Enter the Password as (.*)$")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	} */
 
	
 //@Given("Click on CRM/SFA")
 @Given("Click on CRM\\/SFA")
 public void clickCrmsfa(){
	 driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
 }
 @And("Click on Leads tab")
 public void clickLead() {
	 driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
 }
 
 @And("Click on Create Lead")
 public void clickCreatLead() {
	 driver.findElement(By.xpath("//a[@href='/crmsfa/control/createLeadForm']")).click();
 }
 @And("Enter the company name as {string}")
 public void entercmpName(String cName) {
	 driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys(cName);
 }
 
 @And("Enter the First name as (.*)$")
 public void enterfName(String fName) {
	 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys(fName);
 }
 
 @And("Enter the Last name as (.*)$")
 public void enterlName(String lName) {
	 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys(lName);
 }
 
 @When("Click on Create Lead button")
 public void clickCreatLeadbtn() {
	 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
 }
 
 @Then("Verify Lead is created")
 public void verifyLeadCreation() {
	 System.out.println(driver.getTitle());
 }
 
 @But("Verify the error message is displayed")
 public void errorMsg() {
	 String text = driver.findElement(By.id("errorDiv")).getText();
		System.out.println(text);
 }
}

