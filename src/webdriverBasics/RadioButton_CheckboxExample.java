package webdriverBasics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton_CheckboxExample {

	public static void main(String[] args) {
		
		
		File file = new File("/Users/mr.a2z/Drivers_Jars/ChromeDriver_103/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@value='radio3']")).click();
		
		driver.findElement(By.name("checkBoxOption3")).click();

	}

}
