package selenium.practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\Java64\\Chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		boolean button=driver.findElementByName("btnK").isDisplayed();
		System.out.println(button);

	}

}
