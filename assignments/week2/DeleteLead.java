package week2.assignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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

		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("4567");
					
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		
		Thread.sleep(2000);
		
		String LeadID = driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]/div[contains(@class,'x-grid3-col-partyId')]/a[@class='linktext']")).getText();
		
		
		driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]/div[contains(@class,'x-grid3-col-partyId')]/a[@class='linktext']")).click();
		
			       
	    driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	    
	  
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    System.out.println("id"+ LeadID);
	    
	    
	    driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadID);
	    driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	    System.out.println("id"+ LeadID);
	    Thread.sleep(2000);
	    String msg = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
	    System.out.println("id"+ LeadID);
	    System.out.println("msg"+ msg);
	    
	    
	    if(msg.equalsIgnoreCase("No records to display"))
		{
			System.out.println("The lead "+ LeadID + " is successfully deleted");
		}else
		{
			System.out.println("The lead "+ LeadID + " is not deleted");
		}
	    


	}

}
