package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Newbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\Desktop\\selenium-java-3.9.1\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		

		
		driver.manage().window().maximize();
		
		driver.get("http://www.marathadial.com/");
	
		
		
		boolean button= driver.findElement(By.xpath("//*[@id='logo']/a/img")).isDisplayed();
		System.out.println("logo is displayed");

	
	}

}
