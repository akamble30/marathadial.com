package sampleProject;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.firefox.*;



public class ToolsQa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Java64\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Desktop\\Java64\\geckodriver.exe");
//FirefoxOptions options = new FirefoxOptions();
//options.setBinary("C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//WebDriver driver = new FirefoxDriver(options);


driver.manage().window().maximize();
String baseurl = "http://toolsqa.com/automation-practice-form/";

driver.get(baseurl);
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

WebElement upload = driver.findElement(By.id("photo"));
upload.sendKeys("C:\\NPkey.txt");
System.out.println("checkbox1 test is pass");


Select Drop = new Select(driver.findElement(By.id("continents")));
Drop.selectByVisibleText("Africa");


	}

}
