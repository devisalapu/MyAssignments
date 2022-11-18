package week2.assignments.week2;

//import java.util.concurrent.TimeUnit;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	
	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get(" https://facebook.com/");
		
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Test Firstname");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Test Lastname");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Test email");

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Test Password");
		
		WebElement monthElem = driver.findElement(By.name("birthday_month"));
		Select mnth = new Select(monthElem);
		mnth.selectByVisibleText("Jun");
		
		WebElement dayElem = driver.findElement(By.name("birthday_day"));
		Select day = new Select(dayElem);
		day.selectByVisibleText("1");
		
		WebElement yearElem = driver.findElement(By.name("birthday_year"));
		Select year = new Select(yearElem);
		year.selectByVisibleText("1990");
		
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		// driver.findElement(By.xpath("//span[contains(text(),'Female')]")).click();

		
		
		
		
		

	}

}
