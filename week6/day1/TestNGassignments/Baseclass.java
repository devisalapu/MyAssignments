package week6.day1.TestNGassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	public ChromeDriver driver;
	@Parameters({"url" , "username" ,"password"})
	
	@BeforeMethod(alwaysRun=true)
	public void precondition(String url, String uname,String pwd) {
	WebDriverManager.chromedriver().setup();
	
	 driver = new ChromeDriver();
	
	driver.get(url);
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys(uname);
	
	driver.findElement(By.id("password")).sendKeys(pwd);
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	
}
 @AfterMethod
 
 public void aftercondition() {
   driver.close();
 }
}
