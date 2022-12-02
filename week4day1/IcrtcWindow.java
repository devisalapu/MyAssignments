package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IcrtcWindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.irctc.co.in/nget/train-searcht");
		
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		String parentHandle = driver.getWindowHandle();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("// a[text()=' FLIGHTS ']")).click();
		Set<String> WindowHandle = driver.getWindowHandles();
		List<String> windows = new ArrayList<String>(WindowHandle);
		driver.switchTo().window(windows.get(1));
		
		System.out.println(driver.getTitle());
		driver.switchTo().window(windows.get(0));
		driver.close();

	}

}
