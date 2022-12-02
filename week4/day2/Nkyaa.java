package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nkyaa {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		
		ChromeDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.nykaa.com/");
		
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions builder= new Actions(driver);
		
		WebElement brand = driver.findElement(By.xpath("//a[@class='css-1mavm7h']/following::a"));
		
		builder.moveToElement(brand).perform();
		driver.findElement(By.id("brandSearchBox")).clear();
		
		
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris");
		driver.findElement(By.linkText("L'Oreal Paris")).click();
		
		
		Thread.sleep(1000);
			
		String PageTitle = driver.getTitle();
		
		if(PageTitle.contains("L'Oreal"))
		{
			System.out.println("L'Oreal Paris products page is opened");
		}else
		{
			System.out.println("Expected page is not opened");
		}
		
		driver.findElement(By.className("sort-name")).click();
		
		
		driver.findElement(By.xpath("//span[contains(text(),'customer top rated')]")).click();
		
		
		driver.findElement(By.xpath("//div[@id='first-filter']//div[@class='css-xdicx1']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@id='first-filter']//div[@class=' css-b5p5ep']//span[@class='side-count']"))));
		
		driver.findElement(By.xpath(" //div[@id='first-filter']//div[@class=' css-b5p5ep']//span[@class='side-count']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='control-box css-1ap0cm9']//div[@class='control-indicator checkbox ']")).click();
		
		Thread.sleep(5000);
		
	    driver.findElement(By.xpath("//div[@class='sidebar__inner']//div[6]//div[@class='css-xdicx1']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='css-1ago99h']//div[6]//div[@class='control-indicator checkbox ']"))));
		
		
		driver.findElement(By.xpath("//div[@class='css-1ago99h']//div[6]//div[@class='control-indicator checkbox ']")).click();
		
		
		
		String filter = driver.findElement(By.xpath("//div[@class='css-1emjbq5']/span[@class='filter-value']")).getText();
		
		if(filter.equalsIgnoreCase("Shampoo")) {
			System.out.println("Filter is applied with Shampoo");
		}
		else
		{
			System.out.println("Filter is not applied with Shampoo");
		}
		
		driver.findElement(By.xpath("//div[@class='css-d5z3ro']/a")).click();
		
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windowHandlesList = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windowHandlesList.get(1));
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@title='SIZE']"));
		Select size = new Select(dropdown);
		size.selectByValue("0");
		
		String mrp = driver.findElement(By.xpath("//h1[contains(text(),'Paris Colour Protect Shampoo')]/following-sibling::div//span[text()='MRP:']/following-sibling::span")).getText();
		System.out.println("The MRP value is : " + mrp);
		
		driver.findElement(By.xpath("//button[@class=' css-12z4fj0']/span[text()='Add to Bag']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		
		driver.switchTo().frame(0);
		
		String grd = driver.findElement(By.xpath("//div[@class='css-15py5ir e25lf6d2']/span")).getText();
		System.out.println("The MRP value is : " + grd);
		
		driver.findElement(By.xpath("//button[@class='css-guysem e8tshxd0']//div[@class='css-207d6f e25lf6d6']/following-sibling::span")).click();
		
		
		
		}
	
				
	}


