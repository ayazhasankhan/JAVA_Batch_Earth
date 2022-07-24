package parallelTesting;


import org.testng.annotations.Test;

public class Google extends LaunchCloseBrowser{

	@Test
	public void atTest() throws Exception{
		
		driver.get("http://www.google.com");
		
		System.out.println(driver.getTitle());
		
	}
	
	
}
