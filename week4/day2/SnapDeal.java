package week4.day2;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Mens = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		
		WebElement Shirts = driver.findElement(By.xpath("//span[text()= 'Shirts']"));
		
	   Actions builder = new Actions(driver);
	   
	   builder.moveToElement(Mens)
	          .pause(Duration.ofSeconds(1))
	          .click(Shirts)
	          .perform();
	   
	   Thread.sleep(1000);
	   WebElement firstShirt = driver.findElement(By.xpath("(//img[@class='product-image '])[1]"));
	   
	   builder.moveToElement(firstShirt).perform();
	  
	   
	   driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
	   
	   

	}

}
