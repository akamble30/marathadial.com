package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Java64\\Chromedriver.exe");
	
	//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("http://marathadial.com/");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Desktop\\selenium-java-3.9.1\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		

		
		driver.manage().window().maximize();
		
		driver.get("http://www.marathadial.com/");
	
		
		
		boolean button= driver.findElement(By.xpath("//*[@id='logo']/a/img")).isDisplayed();
		System.out.println("logo is displayed");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Desktop\\Java64\\geckodriver.exe");
		
		
	
		
		

	}

}
