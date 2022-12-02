package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDealAsg {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://www.snapdeal.com/");
		
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement Mens = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		
		WebElement Shirts = driver.findElement(By.xpath("//span[text()= 'Sports Shoes']"));
		
	   Actions builder = new Actions(driver);
	   builder.moveToElement(Mens)
              .pause(Duration.ofSeconds(1))
              .click(Shirts)
              .perform();
	   String count = driver.findElement(By.xpath("//a[@href='/products/mens-footwear-sports-shoes#bcrumbLabelId:255']/div[2]")).getText();
	   System.out.println("Count of Sports shoes :" + count);
	   Thread.sleep(4000);
	   
	   driver.findElement(By.xpath("//a[@ href='/products/mens-training-shoes#bcrumbLabelId:255']/div[text()='Training Shoes']")).click();
	   
	   driver.findElement(By.xpath("//div[@class='sort-selected']")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//ul[@class='sort-value']/li[@data-index='1']")).click();
	   
	   List<WebElement> prodPrices = driver.findElements(By.xpath("//div[@id='products']//span[@class='lfloat product-price']"));
	   Thread.sleep(5000);
	   List<Integer> priceValues = new ArrayList<Integer>();
		
		for(int i=1;i<=prodPrices.size();i++)
		{
			WebElement prodPrice = driver.findElement(By.xpath("(//div[@id='products']//span[@class='lfloat product-price'])[" + i + "]"));
			System.out.println(prodPrice.getText());
			priceValues.add(Integer.parseInt(prodPrice.getText().replaceAll("[^0-9]", "")));
			
		}
		System.out.println(priceValues); 
		
		List<Integer> sortPrice = new ArrayList<Integer>(priceValues);
		Collections.sort(sortPrice);
		System.out.println(sortPrice);
		
		if(priceValues.equals(sortPrice)) 
			System.out.println("Sort order matching");
		else
			System.out.println("Sort order not matching");
		
		driver.findElement(By.xpath("//div[@class='price-text-box']/input[@class='input-filter']")).clear();
		
		driver.findElement(By.xpath("//div[@class='price-text-box']/input[@class='input-filter']")).sendKeys("900");
		
		driver.findElement(By.xpath("//div[@class='filter-content']//div[4]/div/input[@class='input-filter']")).clear();
		
		driver.findElement(By.xpath("//div[@class='filter-content']//div[4]/div/input[@class='input-filter']")).sendKeys("1200");
	
		
		driver.findElement(By.xpath("//div[contains(text(),'GO')]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='filter-inner filter-inner-height']/div/label")).click();
		
		System.out.println("input3");
		
		List<WebElement> filter1 = driver.findElements(By.xpath("(//div[@class='filters-top-selected']/div[@class='filters']/div/a)"));
		
		List<String> filterValue = new ArrayList<String>();
		
		for (int i=1; i<=filter1.size();i++) {
			WebElement filter2 = driver.findElement(By.xpath("(//div[@class='filters-top-selected']/div[@class='filters']/div/a)["+i+"]"));
			
			wait.until(ExpectedConditions.visibilityOf(filter2));
			
			filterValue.add(i-1, filter2.getText().replaceAll("[^A-Za-z0-9.-]", ""));
	}

	System.out.println("Filter Values : "+ filterValue);	
	
	WebElement mousehover= driver.findElement(By.xpath("//div[@class='product-tuple-image ']"));
	builder.moveToElement(mousehover).perform();
	Thread.sleep(5000);
	
	//Clicking on QuickView
	
	driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div")).click();
	
	Thread.sleep(5000);
	
	System.out.println(driver.findElement(By.xpath("//div[@class='sidebarin comp-qv']/div[4]//div[@class='lfloat']/div[2]/span")).getText());
	System.out.println(driver.findElement(By.xpath("//div[@class='sidebarin comp-qv']/div[4]//div[@class='lfloat']/div[2]/span[2]")).getText());
	
	File source = driver.getScreenshotAs(OutputType.FILE);
	File destination = new File("./Snaps/Shoes.png");
	FileUtils.copyFile(source, destination);
	
	driver.close();
	driver.quit();
}
	}
