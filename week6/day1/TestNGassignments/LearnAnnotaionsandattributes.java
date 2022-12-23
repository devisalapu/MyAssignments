package week6.day1.TestNGassignments;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class LearnAnnotaionsandattributes {
	
	@BeforeSuite
	public void beforesuit() {
		System.out.println("BeforeSuit");
	}
	
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}
		
	
	@BeforeClass
	public void Befoesuit() {
		System.out.println("Beforeclass");
	}
	
		
	@BeforeMethod
	public void BefoeMethod() {
		System.out.println("Beforemethod");
			}
	@Test
	public void test1() {
		System.out.println("Test1");
		throw new  RuntimeException();
	}
	@Test(priority = 1)
	public void test2() {
		System.out.println("Test2");
	}
	
	@Test(enabled = false)
	public void test3() {
		System.out.println("Test3");
	}
	
	@Test(invocationCount = 3,priority = 0)
	public void test4() {
		System.out.println("Test4");
	}
	
	@Test(dependsOnMethods = "test1" ,alwaysRun = true)
	public void test5() {
		System.out.println("Test5");
	}
	
	@AfterMethod
	public void AfterMethod() {
		System.out.println("Aftermethod");
		
	}
	
	@AfterClass
	public void AfterClass() {
		System.out.println("Afterclass");
		
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void aftersuit() {
		System.out.println("AfterSuit");
	}

}
