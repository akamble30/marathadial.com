package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkscount {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Java64\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.marathadial.com/");
		
		//"a" is used as anchor tag
		java.util.List<WebElement> Links=driver.findElements(By.tagName("a"));
	System.out.println("Total numbers of links are" +Links.size());
	
	//i represents the value of files
	//Links.size is the inbuild function
	
	
	for(int i=1;i<=Links.size();i=i+1)
	{
		System.out.println(Links.get(i).getText());
	}
	}

}
