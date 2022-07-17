package webdriverBasics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownExample {

	public static void main(String[] args) {
		
		
		File file = new File("/Users/mr.a2z/Drivers_Jars/ChromeDriver_103/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement element = driver.findElement(By.id("dropdown-class-example"));
		
		
		
       // new Select(element).selectByIndex(1);
        
        
       // new Select(element).selectByValue("option2");
        new Select(element).selectByVisibleText("Option3");
        
        
        
       
	}

}
