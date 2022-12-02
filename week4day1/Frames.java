package week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ssnceyfd5mtq1u38yu3inp0zh436503.node0");
		String parentHandle = driver.getWindowHandle();
		
		System.out.println(driver.getTitle());
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//div[@class=\"card\"]/button[@id='j_idt88:new']/span[@class='ui-button-text ui-c']")).click();
		
		Set<String> WindowHandle = driver.getWindowHandles();
		
		List<String> windows = new ArrayList<String>(WindowHandle);
		
		driver.switchTo().window(windows.get(1));
		
		String str = driver.getTitle();
		
		System.out.println("Title " + str);
		driver.close();
		driver.switchTo().window(windows.get(0));
		String str1 = driver.getTitle();
		System.out.println("Title " + str1);
		driver.findElement(By.xpath("//div[@class=\"card\"]/button[@id='j_idt88:j_idt91']/span[@class='ui-button-text ui-c']")).click();
		
		driver.switchTo().window(parentHandle);
		
		
		driver.findElement(By.xpath("//div[@class=\"card\"]/button[@id='j_idt88:j_idt93']/span[@class='ui-button-icon-right ui-icon ui-c pi pi-bookmark']")).click();
		
Set<String> WindowHandle1 = driver.getWindowHandles();
		
		List<String> windows1 = new ArrayList<String>(WindowHandle1);
		
		int i = driver.getWindowHandles().size();
		System.out.println(i-1);
		
		
		for (String windowHandle : driver.getWindowHandles())
		{
			if(!parentHandle.contentEquals(windowHandle)) {
				driver.switchTo().window(windowHandle);
				driver.close();
			}
		}
		
		driver.switchTo().window(parentHandle);
		String str2 = driver.getTitle();
		System.out.println("Title " + str2);

	}

}
