package sampleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstClass {

	public static void main(String[] args) {
	
		
	//System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Desktop\\Java64\\geckodriver.exe");


	WebDriver driver;
	//System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Java64\\Chromedriver.exe");
	//WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	webDriver driver = new FirefoxDriver();
	System.out.println("driver.getTitle");
	
	
	driver.get("http://marathadial.com/");
	
//String actualTitle=("");
//String expectedTitle("http://marathadial.com/")
	//	System.out.println("webdriver.chrome.driver", "");
		
		//driver.manage = new ChromeDrive();
		System.out.println(driver.getTitle());
		//driver.close();
	}

}
