package parallelTesting;


import org.testng.annotations.Test;


public class Yahoo extends LaunchCloseBrowser{

	@Test
	public void atTest() throws Exception{
		
		driver.get("http://www.yahoo.com");
		
		System.out.println(driver.getTitle());
		
	}
	
	
}