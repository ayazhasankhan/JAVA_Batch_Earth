package webdriverBasics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstWebdriverTest {

	public static void main(String[] args) {
		
		
		File file = new File("/Users/mr.a2z/Drivers_Jars/ChromeDriver_103/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		driver.findElement(By.name("name")).sendKeys("AutomationTest");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("mail.ayaz.hasan@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("12345");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		
		
		driver.close();

	}

}
