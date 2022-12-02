package week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergrContact {

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
		
		
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/contactsMain\']")).click();
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/mergeContactsForm']")).click();

		
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
			driver.findElement(By.className("buttonDangerous")).click();
			
			Alert acpt= driver.switchTo().alert();
			acpt.accept();
			
			String str4 = driver.getTitle();
			
			System.out.println("Title " + str4);
	}

}
