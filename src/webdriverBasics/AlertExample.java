package webdriverBasics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertExample {

	public static void main(String[] args) throws Exception {
		
		
		File file = new File("/Users/mr.a2z/Drivers_Jars/ChromeDriver_103/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("confirmbtn")).click();
        
        String s =driver.switchTo().alert().getText();
        System.out.println(s);
        driver.switchTo().alert().accept();
        
        
        
       
	}

}
