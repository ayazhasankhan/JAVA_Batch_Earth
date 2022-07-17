package webdriverBasics;

import java.io.File;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleWindowsHandlingExample {

	public static void main(String[] args) throws Exception {
		
		
		File file = new File("/Users/mr.a2z/Drivers_Jars/ChromeDriver_103/chromedriver");
		System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
         driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    	
        driver.findElement(By.xpath("//button[@id='openwindow']")).click();
        
    	 
        String parent=driver.getWindowHandle();
        
        Set<String>s =driver.getWindowHandles();
        
        
        System.out.println("Total number of windows/tabs " + s.size());
        
        
        Iterator itr =s.iterator();
        
        
        while(itr.hasNext()) {
        	
        	String child_window = (String) itr.next();
        	
        	if(!parent.equals(child_window)) {
        		driver.switchTo().window(child_window);
        		System.out.println(driver.getTitle());;
        		
        		//driver.findElement(By.xpath("//input[@name='meetingId']")).sendKeys("ayaz.meetinglink");
        		driver.close();
        		
        	}
        }
        driver.switchTo().window(parent);
        
        System.out.println(driver.getTitle());;
       // driver.findElement(By.xpath("(//span[@class='cta__text'][contains(.,'View demo')])[2]")).click();

        
        
        
       
	}

}
