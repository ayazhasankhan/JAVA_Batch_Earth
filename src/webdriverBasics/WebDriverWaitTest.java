package webdriverBasics;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		
		
		File file = new File("/Users/mr.a2z/Drivers_Jars/ChromeDriver_103/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ringcentral.com/");
		driver.findElement(By.xpath("//div[@class='cta cta--btn cta--btn--phoenix cta--btn-style--bright-blue cta--btn-size--default cta--link-desktop-size--default cta--link-tablet-size--default cta--link-mobile-size--default UID-e7650b2b-cta-cta_copy IID-cta-5dfe9395 CID-cta-113ca695']//span[@class='cta__text'][normalize-space()='See pricing']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[normalize-space()='Plans & Pricing']")));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(Exception.class);
		driver.findElement(By.xpath("//a[@aria-label='Try Free Essentials plan']//span[@class='cta__text'][normalize-space()='Try free']")).click();


        
        
       
	}

}
