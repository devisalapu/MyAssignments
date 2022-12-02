package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckText {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
			
			driver.manage().window().maximize();
			// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.switchTo().frame("iframeResult");
			
			  driver.findElement(By.xpath("//button[text()= 'Try it']")).click();
			Alert alert =   driver.switchTo().alert();
			 alert.sendKeys("sree");
			
			 alert.accept();
			 String str = driver.findElement(By.xpath("//p[@id='demo']")).getText();
			 System.out.println("Alert text is : " + str);
			 
			 if (str.contains("sree"))
				 System.out.println("Given text is correct");
			 else
				 System.out.println("Given text is not correct");
			 
			 driver.switchTo().defaultContent();
			 
			  
			

	}

}
