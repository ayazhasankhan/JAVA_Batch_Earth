package webdriverBasics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenUrl {

	public static void main(String[] args) throws Exception {
		

		File file = new File("/Users/mr.a2z/Drivers_Jars/FireFoxDriver/geckodriver");
		System.setProperty("webdriver.gecko.driver", file.getAbsolutePath());
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Cucumber");
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//button[@type='button'][contains(.,'ADD TO CART')]")).click();
		
		//driver.quit();
		
	}

}
