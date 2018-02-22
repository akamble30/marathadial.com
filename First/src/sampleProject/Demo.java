package sampleProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\Desktop\\Java64\\chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver","C:\\Users\\LENOVO\\Desktop\\Java64\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseurl = "https://www.facebook.com/";
		driver.get(baseurl);
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("akshay30kamble@gmail.com");

		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("30972777");

		/*
		 * WebElement button = driver.findElement(By.id("u_0_2"));
		 * button.click();
		 */

		WebElement first = driver.findElement(By.name("firstname"));
		first.sendKeys("akshay");

		

		WebElement surname = driver.findElement(By.name("lastname"));
		surname.sendKeys("kamble");

		
		
		/*
		 * WebElement pass = driver.findElement(By.name(""));
		 * pass.sendKeys("30972777");
		 * 
		 * WebElement button = driver.findElement(By.id("u_0_2"));
		 * button.click();
		 * 
		 * 
		 * 
		 * 
		 * /* String
		 * expectedtitle="Marathadial.com -Maratha Business Directory"; String
		 * actualtitle=""; actualtitle =driver.getTitle();
		 * 
		 * 
		 * if (actualtitle.contentEquals(expectedtitle)){
		 * System.out.println("Test Passed!"); } else {
		 * System.out.println("Test Failed"); }
		 */

		// System.out.println("driver.getTitle");

	}
}
