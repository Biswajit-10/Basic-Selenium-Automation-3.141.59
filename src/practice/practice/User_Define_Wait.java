package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Define_Wait {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jio.com/");
		driver.get("https://www.airtel.in/");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.get("");
		
		
				
	}
}
