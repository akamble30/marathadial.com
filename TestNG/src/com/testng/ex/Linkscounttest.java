package com.testng.ex;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Linkscounttest {
public WebDriver driver;
	@Test
  public void test1() {
	  
		java.util.List<WebElement>Links=driver.findElements(By.tagName("a"));
		System.out.println("Total numbers of links are" +Links.size());
		
		//i represents the value of files
		//Links.size is the inbuild function
		
		
		for(int i=1;i<=Links.size();i=i+1)
		{
			System.out.println(Links.get(i).getText());
		}
		}

  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Java64\\Chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
