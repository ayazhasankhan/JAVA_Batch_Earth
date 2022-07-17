package webdriverBasics;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseHoverExample {

	public static void main(String[] args) throws Exception {
		
		
		File file = new File("/Users/mr.a2z/Drivers_Jars/ChromeDriver_103/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ringcentral.com/");
		
		Actions act = new Actions(driver);
		//act.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Products']")));
		act.keyDown(Keys.ARROW_DOWN);
		act.build().perform();
		

        
        
       
	}

}
