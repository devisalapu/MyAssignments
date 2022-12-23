package week6.day1.TestNGassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends Baseclass {
	@Test(priority = 3, groups = "Smoke", dependsOnMethods = "week2.day1assignments.CreateLead.runCreateLead")
	public  void main() throws InterruptedException  {
		
		
		//driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Leads")).click();		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Company Name");		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test First Name");		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test Last Name");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Test First Name Local");
		driver.findElement(By.name("departmentName")).sendKeys("Test Department");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testemail@gmail.com");
		
		WebElement stateElem = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state = new Select(stateElem);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();	
		
		driver.findElement(By.linkText("Edit")).click();		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Test Important Note");
		driver.findElement(By.name("submitButton")).click();		
		
		
		System.out.println(driver.getTitle()); 
		
	}

}
