package week4day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Setting up the driver
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();

				//launching the URL application
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro", Keys.ENTER);
				
				String price = driver.findElement(By.xpath("//span[@class='a-price']")).getText();
				System.out.println("The price of the first product is: " + price);
				
				
				System.out.println("Number of reviews for the first product is: " + driver.findElement(By.xpath("//a[@class='a-popover-trigger a-declarative']//ancestor::span[@class='a-declarative']//following::a/span")).getText());

				
	            driver.findElement(By.xpath("//span[text()='RESULTS']//following::h2//span")).click();
	           
	            
	            Thread.sleep(1000);
	            Set<String> windowHandles = driver.getWindowHandles();
	    		List<String> windowHandle = new ArrayList<String>(windowHandles);
	    		driver.switchTo().window(windowHandle.get(1));
	    		System.out.println(driver.getTitle());

	    		File source = driver.getScreenshotAs(OutputType.FILE);
	    		File destination = new File("./Snaps/oneplus.png");
	    		FileUtils.copyFile(source, destination);
	           
	    		driver.findElement(By.xpath("//div[@class='a-button-stack']//input[@id='add-to-cart-button']")).click();

	    		
	    		Thread.sleep(5000);
		    String str=	driver.findElement(By.xpath("//div[@id='attach-desktop-sideSheet']//span[@id='attach-accessory-cart-subtotal']")).getText();
		    System.out.println("Get Text: " + driver.findElement(By.xpath("//div[@id='attach-desktop-sideSheet']//span[@id='attach-accessory-cart-subtotal']")).getAttribute("textContent"));
		    		System.out.println("subtotal");
	    	System.out.println(str);
	    	
	    	String s1 = price.toString().replace("₹", "").replace(",", "").replace(".00", "");
	    	String s2 = price.toString().replace("₹", "").replace(",", "").replace(".00", "");  
	    	
	    	if(s1.equalsIgnoreCase(s2))
	    		System.out.println("Price " + s1 + " str " + s2 + " are matching");
	    	else
	    		System.out.println("Price " + s1 + " str " + s2 + " are not matching");
	    	
	    	driver.close();
	}

}
