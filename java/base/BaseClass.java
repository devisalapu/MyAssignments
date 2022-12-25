package base;

import java.io.IOException;
//import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import Utlis.ReadExcell;
import io.github.bonigarcia.wdm.WebDriverManager;
//import testcases.ReadExcell;

public class BaseClass {

	public RemoteWebDriver driver;
	public String filename;
	public String update;
	
	//@Parameters({"url","username","password"})
	@BeforeMethod()
	public void preCondition() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.id("username")).sendKeys("DemoCSR");
		//driver.findElement(By.id("password")).sendKeys("crmsfa");
//		driver.findElement(By.className("decorativeSubmit")).click();

	}

	@AfterMethod()
	public void postCondition() {
		driver.close();
	}
	
	 @DataProvider( name = "createdata")
	   public String[][] getData() throws IOException {
		
		 int shtNbr = 0; 
		 String[][] data = ReadExcell.readData(filename, shtNbr);
		
		return data;
	   }
	 
	 @DataProvider( name = "editdata")
	   public String[][] getData2() throws IOException {
		 int shtNbr = 0; 
		 String[][] data = ReadExcell.readData(filename, shtNbr);
		
		return data;
	   }
	 
	 @DataProvider( name = "deletedata")
	   public String[][] getData3() throws IOException {
		 int shtNbr = 0; 
		 String[][] data = ReadExcell.readData(filename, shtNbr);
		
		return data;
	   }
	 
	 @DataProvider( name = "duplicatedata")
	   public String[][] getData4() throws IOException {
		 int shtNbr = 0; 
		 String[][] data = ReadExcell.readData(filename, shtNbr);
		
		return data;
	   }
}
