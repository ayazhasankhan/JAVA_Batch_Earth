package webdriverBasics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SuggestionClassExample {

	public static void main(String[] args) throws Exception {
		
		
		File file = new File("/Users/mr.a2z/Drivers_Jars/ChromeDriver_103/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("autocomplete")).sendKeys("Ca");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@tabindex='-1'][contains(.,'Canada')]")).click();

        
        
        
       
	}

}
