package testNG;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class TestNGTestCases {

	WebDriver driver;
	
@BeforeTest
public void setUp() {
	
	File file = new File("/Users/mr.a2z/Drivers_Jars/ChromeDriver_103/chromedriver");
	System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
	
    driver = new ChromeDriver();
	driver.manage().window().maximize();
}

@Test
public void mouserHover() {
	driver.get("https://www.ringcentral.com/");
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Products']")));
	//act.keyDown(Keys.ARROW_DOWN);
	act.build().perform();
	
}

@Test
public void dropdown() {
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	WebElement element = driver.findElement(By.id("dropdown-class-example"));
   // new Select(element).selectByIndex(1);
   // new Select(element).selectByValue("option2");
    new Select(element).selectByVisibleText("Option3");
	
}

@AfterTest
public void tearDown() {
	
	driver.close();
	
}

}
