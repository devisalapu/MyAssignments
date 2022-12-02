package week4day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesAsg {

	public static void main(String[] args) {
		
		//Setting up the driver
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		//launching the URL application
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Switching to the corresponding frame using frame id
		
		driver.switchTo().frame("frame1");
		
		driver.findElement(By.xpath("//b[@id='topic']/following-sibling::input")).sendKeys("Frames Example");
		
		// Switching to next frame and clicking the check box
         driver.switchTo().frame("frame3");
         driver.findElement(By.id("a")).click();
         

		
		// Switching to the default frame to access the other frame
		
		driver.switchTo().defaultContent();
		
		
		//Switching to the corresponding frame using frame id
		
		driver.switchTo().frame("frame2");
		WebElement animalDropdown = driver.findElement(By.id("animals"));
		
		
		// Selecting desired animal from the dropdown list
		
		Select animal = new Select(animalDropdown);
		animal.selectByVisibleText("Avatar");
		
		
		// Switching back to the default frame
		
			driver.switchTo().defaultContent();

			driver.close();
		
		
		
		
		
		
		

	}

}
