package week2.assignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadAssig {

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
		
		driver.findElement(By.xpath("(//form[@class=' x-form']//input[@name='firstName'])[3]")).sendKeys("abcxyz");
		System.out.println("abx");
		
		driver.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[contains(@class,'x-grid3-td-partyId')]/div[contains(@class,'x-grid3-col-partyId')]/a[@class='linktext']")).click();
		String title = driver.getTitle();
		System.out.println("Title" + title);

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@href='updateLeadForm?partyId=12963']")).click();
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("TestLeaf");
		
		String update = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).getText();
		
			
        driver.findElement(By.xpath("//input[@value='Update']")).click();
		
			
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
