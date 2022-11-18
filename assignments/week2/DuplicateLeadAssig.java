package week2.assignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadAssig {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://leaftaps.com/opentaps/control/main");
			
			driver.manage().window().maximize();
			
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			
			driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
			
			Thread.sleep(2000);
			
			
			driver.findElement(By.xpath("//a[@href='/crmsfa/control/leadsMain']")).click();
			driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();

			
			driver.findElement(By.xpath("//span[text()='Email']")).click();
			
			driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("Amwell@gmail.com");
			
						
			driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
			Thread.sleep(2000);
			
			String firstName = driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-firstName')]/div[contains(@class,'x-grid3-col-firstName')]/a[@class='linktext']")).getText();
			Thread.sleep(2000);
			
				
			
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]/div[contains(@class,'x-grid3-col-partyId')]/a[@class='linktext']")).click();
			
		    
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
		    
		    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		    
		    String dupFirst = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
		    		    
		  	    
		    if(firstName.equalsIgnoreCase(dupFirst))
			{
				System.out.println("The lead name is matching");
			}else
			{
				System.out.println("The lead name is not matching");
			}
		    
	

	} 

}
