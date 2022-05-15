package AdvanceSelenium;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteText {
static {
		
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		String email = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(email);
		for(int i=email.length();i>0;i--) {
			Thread.sleep(100);
	    driver.findElement(By.id("email")).sendKeys(Keys.DELETE);
		}
		driver.close();
	}
}
