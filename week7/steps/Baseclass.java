package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass extends AbstractTestNGCucumberTests{
	

	public static ChromeDriver driver;
	@BeforeMethod
	public void Precond()  {
		
     WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control.html");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
	//	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	//	driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
	}
	@AfterMethod
	public void Aftercond() {
		driver.close();
	}

}
