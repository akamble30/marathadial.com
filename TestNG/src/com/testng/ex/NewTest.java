package com.testng.ex;

import org.testng.annotations.Test;

import sampleProject.webDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
  public WebDriver driver;
	@Test
   public void test1()
   {
		
		
   }
	
  @BeforeMethod
  public void beforeMethod() {
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Java64\\Chromedriver.exe");
			
			
		 driver = new ChromeDriver();
			System.out.println("driver.getTitle");
			
			driver.manage().window().maximize();
			driver.get("http://toolsqa.com/automation-practice-form/");
			
		}

	  
  }

  @AfterMethod
  public void afterMethod() {
	  WebElement link = driver.findElement(By.partialLinkText("Partial"));
	  link.click();
	  System.out.println("partial linktest is pass");

	  WebElement link1 = driver.findElement(By.linkText("Link Test"));
	  link1.click();
	  System.out.println("link test is pass");

	  driver.navigate().back();

	  WebElement fname = driver.findElement(By.name("firstname"));
	  fname.sendKeys("akshay");
	  System.out.println("firstname is pass");

	  WebElement gender = driver.findElement(By.id("sex-0"));
	  gender.click();
	  System.out.println("gender test is pass");

	  WebElement check = driver.findElement(By.id("profession-0"));
	  check.click();
	  System.out.println("checkbox test is pass");

	  WebElement check1 = driver.findElement(By.id("profession-1"));
	  check1.click();
	  System.out.println("checkbox1 test is pass");

  
  }
  

 
}
