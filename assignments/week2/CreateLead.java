package week2.assignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//p[@class='top']/input[@id='username']")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");
		
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/contactsMain']")).click();	
		
		driver.findElement(By.xpath("//div[@class='frameSectionBody']//a[@href='/crmsfa/control/createContactForm']")).click();
		
				
		driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Test First Name");		
		driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("Test Last Name");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Test First Name Local");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Test Last Name Local");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Test Department");
		driver.findElement(By.name("description")).sendKeys("Test Description");
		//driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testemail@gmail.com");
		
		WebElement stateElem = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select state = new Select(stateElem);
		state.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle()); 


	}

}

