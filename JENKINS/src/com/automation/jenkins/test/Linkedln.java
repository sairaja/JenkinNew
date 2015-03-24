package com.automation.jenkins.test;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Linkedln {

	
	WebDriver driver;
	
	@Before
	public void openbrowser()
	{
	    driver=new FirefoxDriver();
		String Baseurl="http://www.Linkedln.com";
		driver.get(Baseurl);
		
		
	}
	
	@Test
	public void test() {
		System.out.println("Finally done");
	}
	
	
	public void exit()
	{
		driver.quit();
	}

}
