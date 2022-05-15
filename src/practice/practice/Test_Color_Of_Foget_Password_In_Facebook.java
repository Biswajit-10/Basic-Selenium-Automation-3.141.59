package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Color_Of_Foget_Password_In_Facebook {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe/");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement e = driver.findElement(By.linkText("Log In"));
		
		String color=e.getCssValue("Create New Account");
		System.out.println("a "+color);
		
		String background_color=e.getCssValue("background-color");
		String font_size=e.getCssValue("font-size");
		String font_weight=e.getCssValue("font-weight");
		
		System.out.println("b "+background_color);
		System.out.println("c "+font_size);
		System.out.println("d "+font_weight);
		driver.close();
	}
}
