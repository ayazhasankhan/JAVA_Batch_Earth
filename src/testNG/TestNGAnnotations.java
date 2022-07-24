package testNG;

import org.testng.annotations.*;


public class TestNGAnnotations {
	

@BeforeSuite
public void beforeSuiteFunction() {
	
	System.out.println("beforeSuiteFunction"); //1
}

@AfterSuite
public void afterSuiteSuiteFunction() {
	
	System.out.println("afterSuiteSuiteFunction"); //9
}

@BeforeTest
public void beforeTestFunction() {
	
	System.out.println("beforeTestFunction"); //2
}

@AfterTest
public void afterTestFunction() {
	
	System.out.println("afterTestFunction"); //8
}

@BeforeClass
public void beforeClassFunction() {
	
	System.out.println("beforeClassFunction"); //3
}

@AfterClass
public void afterClassFunction() {
	
	System.out.println("afterClassFunction"); //7
}

@BeforeMethod
public void BeforeMethodFunction() {
	
	System.out.println("BeforeMethodFunction"); //4
}

@AfterMethod
public void afterMethodFunction() {
	
	System.out.println("afterMethodFunction"); //6
}

@Test
public void testFunction() {
	
	System.out.println("testFunction"); //5
}


}
