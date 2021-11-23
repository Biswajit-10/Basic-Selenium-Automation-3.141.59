package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver1=new ChromeDriver();
		WebDriver driver2=new ChromeDriver();
		System.out.println(driver1);
		System.out.println(driver2);

		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
		driver1.findElement(By.linkText("urlLink")).sendKeys(selectLinkOpeninNewTab);
	}
}