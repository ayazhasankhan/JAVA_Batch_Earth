package testNG;

import org.testng.annotations.*;


public class TestNGAnnotations2 {

@Test(priority=1)
public void test1Function() {
	
	System.out.println("test1Function");
}


@Test(priority=3)
public void test2Function() {
	
	System.out.println("test2Function"); 
}
	
@Test(priority=2)
public void test3Function() {
	
	System.out.println("test3Function"); 
}


  @BeforeMethod public void BeforeMethodFunction() {
  
  System.out.println("BeforeMethodFunction"); }


  @AfterMethod public void afterMethodFunction() {
 
 System.out.println("afterMethodFunction"); }
 

}
