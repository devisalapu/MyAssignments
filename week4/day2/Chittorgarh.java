package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chittorgarh {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		
		ChromeDriver driver = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.chittorgarh.com/");
		
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//nav[@id='nav_stockmarket']/div/div/div[2]/a[2]")).click();
		
		List<WebElement> securityNames = driver.findElements(By.xpath("(//h2[contains(text(),'NSE Bulk Deals')]/following-sibling::div/table/tbody/tr/td[3])"));
		List<String> securityName = new ArrayList<String>();
		for (int i = 1; i <= securityNames.size(); i++) {
			
			securityName.add(driver.findElement(By.xpath("(//h2[contains(text(),'NSE Bulk Deals')]/following-sibling::div/table/tbody/tr/td[3])[" + i + "]"))
					.getText());
			
			System.out.println(securityName.get(i - 1));
		}

		Set<String> secNameUniq = new LinkedHashSet<String>(securityName);
		
		if (securityName.size()== secNameUniq.size()) {
			System.out.println("No Duplicates");
		}else
		{
			System.out.println(" Duplicates present");
			
		}
		}

	}


