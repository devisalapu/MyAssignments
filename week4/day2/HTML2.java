package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTML2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://html.com/tags/table/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		List<WebElement> library = driver.findElements(By.xpath("//div[@class='render']/table/tbody/tr"));
		
		List<String> libNames = new ArrayList<String>();
		
		for(WebElement lib : library) {
			
			libNames.add(lib.getText());
			System.out.println(lib.getText());
		
		}

	}

}
