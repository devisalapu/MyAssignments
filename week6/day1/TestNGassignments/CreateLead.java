package week6.day1.TestNGassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends Baseclass {
	
	
    @Test(dataProvider = "getdata", priority = 1, groups = "Smoke")
    
	public  void runCreateLead(String cName, String fName, String lName) throws InterruptedException  {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Leads")).click();		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Test First Name Local");
		driver.findElement(By.name("departmentName")).sendKeys("Test Department");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testemail@gmail.com");
		
		WebElement stateElem = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state = new Select(stateElem);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		System.out.println(driver.getTitle()); 

	}

    @DataProvider( name = "getdata")
    public String[][] setData() {
	String[][] data =  new String[2][3];
	data[0][0] = "TestLeaf";
	data[0][1] = "Sree";
	data[0][2] = "J";
	data[1][0] = "Test";
	data[1][1] = "Sree1";
	data[1][2] = "R";
	
	return data;
	
}
}


