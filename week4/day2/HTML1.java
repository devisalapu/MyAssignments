package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML1 {
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		
		ChromeDriver driver = new ChromeDriver(options);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://html.com/tags/table/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr"));
		
		
		System.out.println("No.of rows " +(rows.size()-1));
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='attributes-list']/tbody/tr[1]/th"));
		
		System.out.println("No.of columns " +(cols.size()));
	
		
		
		
}
}