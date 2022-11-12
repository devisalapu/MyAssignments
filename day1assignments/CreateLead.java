package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control.html");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
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
		
		System.out.println(driver.getTitle()); 

	}

}
